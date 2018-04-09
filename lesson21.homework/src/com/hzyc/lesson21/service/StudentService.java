package com.hzyc.lesson21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzyc.lesson21.bean.Student;
import com.hzyc.lesson21.mapper.StudentMapper;

@Service
public class StudentService {
	
	//声明
	//自动注入，相当于在set方法上使用@Resource注解
	@Autowired
	private StudentMapper studentMapper;
	
	
	
	
	
	//开发技巧：通常service的方法名可以和接口中的方法名一致。
	public boolean insertStudent(Student s){
		boolean result = false;
		try {
			//开发常识：
			int row = studentMapper.insertStudent(s);
			if(row > -1){
				result = true;
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}
	
	
	
	public List<Student> queryStudent(){
		 return studentMapper.queryStudent();
		
	}
	
	public Student queryStudentById(String id){
		return studentMapper.queryStudentById(id);
		
	}
	public Student queryStudentById1(String id){
		return studentMapper.queryStudentById1(id);
		
	}
	
	public boolean updateStudent(Student s){
		int result = studentMapper.updateStudent(s);
		if(result > -1){
			return true;
		}
		
		
		return false;
	}
	public boolean deleteStudent(Student s){
		int result = studentMapper.deleteStudent(s);
		if(result > -1){
			return true;
		}
		
		
		return false;
	}
}
