package com.hzyc.lesson21.mapper;

import java.util.List;

import com.hzyc.lesson21.bean.Student;



public interface StudentMapper {
	
	public int insertStudent(Student s);
	
	public List<Student> queryStudent();
    public Student queryStudentById(String id);
    public  Student queryStudentById1(String id);
	
	public int updateStudent(Student s);
	public int deleteStudent(Student s);

}
