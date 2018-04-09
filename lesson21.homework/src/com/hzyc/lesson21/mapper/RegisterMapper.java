package com.hzyc.lesson21.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hzyc.lesson21.bean.Register;



public interface RegisterMapper {
	
	public int insertUser(Register g);
	public List<Register> queryUser(@Param("username")String username,@Param("password")String password);


}
