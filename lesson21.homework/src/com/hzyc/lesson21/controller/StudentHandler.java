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
	
	//springmvc的参数绑定：HttpServletRequest,Response,Session,基本数据类型,String,String[],Bean类
	//bean类:要求页面上的控件的name属性值和bean类的成员变量名一致。
	@RequestMapping("/addStudent.do")
	public ModelAndView addStudent(Student s){
		
		ModelAndView modelAndView  = new ModelAndView();
		//System.out.println(s);将得到的s对象中的值，添加到数据库中。
		boolean result = studentService.insertStudent(s);
		//一个控制器的方法中可以同时调用多个service，甚至是一个service的多个方法，甚至是可以调用其他的.do请求。
		List<Student> sList = studentService.queryStudent();
		
		if(result){
			//跳转到显示所有学生信息的页面
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
			//提示修改失败
			return "error.jsp";
		}
	}
	@RequestMapping("deleteStudent.do")
	public String deleteStudent(Student s){
		boolean bool = studentService.deleteStudent(s);
		if(bool){
			
			return "queryStudent.do";
			
		}else{
			//提示修改失败
			return "error.jsp";
		}
	}
	/*@RequestMapping("/queryStudent.do")
	public void queryStudent(){
		
	}
	*/
	

}
