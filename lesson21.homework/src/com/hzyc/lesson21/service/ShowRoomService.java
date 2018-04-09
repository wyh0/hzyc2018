package com.hzyc.lesson21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzyc.lesson21.bean.ShowRoom;
import com.hzyc.lesson21.mapper.ShowRoomMapper;



@Service
public class ShowRoomService {
	//声明
	//自动注入，相当于在set方法上使用@Resource注解
	@Autowired
	private ShowRoomMapper showroomMapper;
	
	
	
	
	
	//开发技巧：通常service的方法名可以和接口中的方法名一致。
	public boolean insertShowRoom(ShowRoom s){
		boolean result = false;
		try {
			//开发常识：
			int row = showroomMapper.insertShowRoom(s);
			if(row > -1){
				result = true;
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}
	
	
	
	public List<ShowRoom> queryShowRoom(){
		 return showroomMapper.queryShowRoom();
		
	}
	
	public ShowRoom queryShowRoomById(String id){
		return showroomMapper.queryShowRoomById(id);
		
	}
	public ShowRoom queryShowRoomById1(String id){
		return showroomMapper.queryShowRoomById1(id);
		
	}
	
	public boolean updateShowRoom(ShowRoom s){
		int result = showroomMapper.updateShowRoom(s);
		if(result > -1){
			return true;
		}
		
		
		return false;
	}
	public boolean deleteShowRoom(ShowRoom s){
		int result = showroomMapper.deleteShowRoom(s);
		if(result > -1){
			return true;
		}
		
		
		return false;
	}
}


