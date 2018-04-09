package com.hzyc.lesson21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzyc.lesson21.bean.Student;
import com.hzyc.lesson21.mapper.StudentMapper;

@Service
public class StudentService {
	
	//����
	//�Զ�ע�룬�൱����set������ʹ��@Resourceע��
	@Autowired
	private StudentMapper studentMapper;
	
	
	
	
	
	//�������ɣ�ͨ��service�ķ��������Ժͽӿ��еķ�����һ�¡�
	public boolean insertStudent(Student s){
		boolean result = false;
		try {
			//������ʶ��
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
