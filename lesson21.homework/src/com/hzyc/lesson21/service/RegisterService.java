package com.hzyc.lesson21.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzyc.lesson21.bean.Register;
import com.hzyc.lesson21.mapper.RegisterMapper;



@Service
public class RegisterService {
	
	@Autowired
	private RegisterMapper registerMapper;
	
	public boolean insertUser(Register g){
		
		
		try {
		int  row  =	registerMapper.insertUser(g);
		if(row > -1){
		return true;
		}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		 
		return false;
	}
	public List<Register> queryUser(String username,String password){
		return registerMapper.queryUser(username,password);
		
		
	}

}
