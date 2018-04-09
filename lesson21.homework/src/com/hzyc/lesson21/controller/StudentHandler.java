package com.hzyc.lesson21.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hzyc.lesson21.bean.Student;
import com.hzyc.lesson21.service.StudentService;

@Controller
public class StudentHandler {
	
	@Autowired
	private StudentService studentService;
	
	//springmvc�Ĳ����󶨣�HttpServletRequest,Response,Session,������������,String,String[],Bean��
	//bean��:Ҫ��ҳ���ϵĿؼ���name����ֵ��bean��ĳ�Ա������һ�¡�
	@RequestMapping("/addStudent.do")
	public ModelAndView addStudent(Student s){
		
		ModelAndView modelAndView  = new ModelAndView();
		//System.out.println(s);���õ���s�����е�ֵ����ӵ����ݿ��С�
		boolean result = studentService.insertStudent(s);
		//һ���������ķ����п���ͬʱ���ö��service��������һ��service�Ķ�������������ǿ��Ե���������.do����
		List<Student> sList = studentService.queryStudent();
		
		if(result){
			//��ת����ʾ����ѧ����Ϣ��ҳ��
			modelAndView.addObject("stuList",sList);
			modelAndView.setViewName("success.jsp");
		}
		
		return modelAndView;
		
	}
	@RequestMapping("/queryStudent.do")
	public ModelAndView queryStudent(){
		ModelAndView mav = new ModelAndView();
		
		List<Student> sList = studentService.queryStudent();
		
		mav.addObject("stuList",sList );
		mav.setViewName("success.jsp");
		
		
		return mav;
	}
	@RequestMapping("/queryStudentById.do")
	public ModelAndView getstudentListById(String id){
		ModelAndView mav = new ModelAndView();
		
		Student s = studentService.queryStudentById(id);
		
		mav.addObject("student",s );
		mav.setViewName("update.jsp");
		
		
		return mav;
	}
	
	@RequestMapping("/queryStudentById1.do")
	public  ModelAndView getstudentListById1(String id){
		ModelAndView mav = new ModelAndView();
		
		Student s = studentService.queryStudentById1(id);
		
		mav.addObject("student",s );
		mav.setViewName("delete.jsp");
		
		
		return mav;
	}
	
	@RequestMapping("updateStudent.do")
	public String updateStudent(Student s){
		boolean bool = studentService.updateStudent(s);
		if(bool){
			
			return "queryStudent.do";
			
		}else{
			//��ʾ�޸�ʧ��
			return "error.jsp";
		}
	}
	@RequestMapping("deleteStudent.do")
	public String deleteStudent(Student s){
		boolean bool = studentService.deleteStudent(s);
		if(bool){
			
			return "queryStudent.do";
			
		}else{
			//��ʾ�޸�ʧ��
			return "error.jsp";
		}
	}
	/*@RequestMapping("/queryStudent.do")
	public void queryStudent(){
		
	}
	*/
	

}
