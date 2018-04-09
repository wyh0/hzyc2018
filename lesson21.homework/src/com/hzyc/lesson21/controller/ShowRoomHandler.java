package com.hzyc.lesson21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hzyc.lesson21.bean.ShowRoom;
import com.hzyc.lesson21.service.ShowRoomService;


@Controller
public class ShowRoomHandler {

	@Autowired
	private ShowRoomService showroomService;
	
	//springmvc的参数绑定：HttpServletRequest,Response,Session,基本数据类型,String,String[],Bean类
	//bean类:要求页面上的控件的name属性值和bean类的成员变量名一致。
	@RequestMapping("/addShowRoom.do")
	public ModelAndView addShowRoom( ShowRoom s){
		
		ModelAndView modelAndView  = new ModelAndView();
		//System.out.println(s);将得到的s对象中的值，添加到数据库中。
		boolean result = showroomService.insertShowRoom(s);
		//一个控制器的方法中可以同时调用多个service，甚至是一个service的多个方法，甚至是可以调用其他的.do请求。
		List<ShowRoom> sList = showroomService.queryShowRoom();
		
		if(result){
			//跳转到显示所有学生信息的页面 
			modelAndView.addObject("stuList",sList);
			modelAndView.setViewName("success.jsp");
		}
		
		return modelAndView;
		
	}
	@RequestMapping("/queryShowRoom.do")
	public ModelAndView queryShowRoom(){
		ModelAndView mav = new ModelAndView();
		
		List<ShowRoom> sList = showroomService.queryShowRoom();
		
		mav.addObject("stuList",sList );
		mav.setViewName("success.jsp");
		
		
		return mav;
	}
	@RequestMapping("/queryShowRoomById.do")
	public ModelAndView getShowRoomListById(String id){
		ModelAndView mav = new ModelAndView();
		
		ShowRoom s = showroomService.queryShowRoomById(id);
		
		mav.addObject("showroom",s );
		mav.setViewName("update.jsp");
		
		
		return mav;
	}
	
	@RequestMapping("/queryShowRoomById1.do")
	public  ModelAndView getshowroomListById1(String id){
		ModelAndView mav = new ModelAndView();
		
		ShowRoom s = showroomService.queryShowRoomById1(id);
		
		mav.addObject("showroom",s );
		mav.setViewName("delete.jsp");
		
		
		return mav;
	}
	
	@RequestMapping("updateShowRoom.do")
	public String updateShowRoom(ShowRoom s){
		boolean bool = showroomService.updateShowRoom(s);
		if(bool){
			
			return "queryShowRoom.do";
			
		}else{
			//提示修改失败
			return "error.jsp";
		}
	}
	@RequestMapping("deleteShowRoom.do")
	public String deleteShowRoom(ShowRoom s){
		boolean bool = showroomService.deleteShowRoom(s);
		if(bool){
			
			return "queryShowRoom.do";
			
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

