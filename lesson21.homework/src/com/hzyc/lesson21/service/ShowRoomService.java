package com.hzyc.lesson21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzyc.lesson21.bean.ShowRoom;
import com.hzyc.lesson21.mapper.ShowRoomMapper;



@Service
public class ShowRoomService {
	//����
	//�Զ�ע�룬�൱����set������ʹ��@Resourceע��
	@Autowired
	private ShowRoomMapper showroomMapper;
	
	
	
	
	
	//�������ɣ�ͨ��service�ķ��������Ժͽӿ��еķ�����һ�¡�
	public boolean insertShowRoom(ShowRoom s){
		boolean result = false;
		try {
			//������ʶ��
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


