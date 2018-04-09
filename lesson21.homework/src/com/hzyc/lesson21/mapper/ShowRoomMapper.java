package com.hzyc.lesson21.mapper;

import java.util.List;

import com.hzyc.lesson21.bean.ShowRoom;



public interface ShowRoomMapper {
	public int insertShowRoom(ShowRoom s);
	
	public List<ShowRoom> queryShowRoom();
    public ShowRoom queryShowRoomById(String id);
    public  ShowRoom queryShowRoomById1(String id);
	
	public int updateShowRoom(ShowRoom s);
	public int deleteShowRoom(ShowRoom s);

}
