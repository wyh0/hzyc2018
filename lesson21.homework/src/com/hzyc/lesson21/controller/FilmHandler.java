package com.hzyc.lesson21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hzyc.lesson21.bean.Film;
import com.hzyc.lesson21.service.FilmService;


@Controller
public class FilmHandler {

	@Autowired
	private FilmService filmService;
	
	//springmvc�Ĳ����󶨣�HttpServletRequest,Response,Session,������������,String,String[],Bean��
	//bean��:Ҫ��ҳ���ϵĿؼ���name����ֵ��bean��ĳ�Ա������һ�¡�
	@RequestMapping("/addFilm.do")
	public ModelAndView addFilm(Film s){
		
		ModelAndView modelAndView  = new ModelAndView();
		//System.out.println(s);���õ���s�����е�ֵ����ӵ����ݿ��С�
		boolean result = filmService.insertFilm(s);
		//һ���������ķ����п���ͬʱ���ö��service��������һ��service�Ķ�������������ǿ��Ե���������.do����
		List<Film> sList = filmService.queryFilm();
		
		if(result){
			//��ת����ʾ����ѧ����Ϣ��ҳ��
			modelAndView.addObject("film",sList);
			modelAndView.setViewName("showFilm.jsp");
		}
		
		return modelAndView;
		
	}
	@RequestMapping("/queryFilm.do")
	public ModelAndView queryFilm(){
		ModelAndView mav = new ModelAndView();
		
		List<Film> sList = filmService.queryFilm();
		
		mav.addObject("film",sList );
		mav.setViewName("showFilm.jsp");
		
		
		return mav;
	}
	@RequestMapping("/queryFilmById.do")
	public ModelAndView getFilmListById(String id){
		ModelAndView mav = new ModelAndView();
		
		Film s = filmService.queryFilmById(id);
		
		mav.addObject("film",s );
		mav.setViewName("updateFilm.jsp");
		
		
		return mav;
	}
	
	@RequestMapping("/queryFilmById1.do")
	public  ModelAndView getFilmListById1(String id){
		ModelAndView mav = new ModelAndView();
		
		Film s = filmService.queryFilmById1(id);
		
		mav.addObject("film",s );
		mav.setViewName("deleteFilm.jsp");
		
		
		return mav;
	}
	
	@RequestMapping("updateFilm.do")
	public String updateFilm(Film s){
		boolean bool = filmService.updateFilm(s);
		if(bool){
			
			return "queryFilm.do";
			
		}else{
			//��ʾ�޸�ʧ��
			return "error.jsp";
		}
	}
	@RequestMapping("deleteFilm.do")
	public String deleteFilm(Film s){
		boolean bool = filmService.deleteFilm(s);
		if(bool){
			
			return "queryFilm.do";
			
		}else{
			//��ʾ�޸�ʧ��
			return "error.jsp";
		}
	}
	/*@RequestMapping("/queryFilm.do")
	public void queryFilm(){
		
	}
	*/
	

}

