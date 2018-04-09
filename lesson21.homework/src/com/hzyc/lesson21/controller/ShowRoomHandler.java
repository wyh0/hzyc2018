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
	
	//springmvc�Ĳ����󶨣�HttpServletRequest,Response,Session,������������,String,String[],Bean��
	//bean��:Ҫ��ҳ���ϵĿؼ���name����ֵ��bean��ĳ�Ա������һ�¡�
	@RequestMapping("/addShowRoom.do")
	public ModelAndView addShowRoom( ShowRoom s){
		
		ModelAndView modelAndView  = new ModelAndView();
		//System.out.println(s);���õ���s�����е�ֵ����ӵ����ݿ��С�
		boolean result = showroomService.insertShowRoom(s);
		//һ���������ķ����п���ͬʱ���ö��service��������һ��service�Ķ�������������ǿ��Ե���������.do����
		List<ShowRoom> sList = showroomService.queryShowRoom();
		
		if(result){
			//��ת����ʾ����ѧ����Ϣ��ҳ�� 
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
			//��ʾ�޸�ʧ��
			return "error.jsp";
		}
	}
	@RequestMapping("deleteShowRoom.do")
	public String deleteShowRoom(ShowRoom s){
		boolean bool = showroomService.deleteShowRoom(s);
		if(bool){
			
			return "queryShowRoom.do";
			
		}else{
			//��ʾ�޸�ʧ��
			return "error.jsp";
		}
	}
	/*@RequestMapping("/queryStudent.do")
	public void queryStudent(){
		
	}
	*/
	

}

