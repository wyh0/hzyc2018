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
	
	//springmvc的参数绑定：HttpServletRequest,Response,Session,基本数据类型,String,String[],Bean类
	//bean类:要求页面上的控件的name属性值和bean类的成员变量名一致。
	@RequestMapping("/addFilm.do")
	public ModelAndView addFilm(Film s){
		
		ModelAndView modelAndView  = new ModelAndView();
		//System.out.println(s);将得到的s对象中的值，添加到数据库中。
		boolean result = filmService.insertFilm(s);
		//一个控制器的方法中可以同时调用多个service，甚至是一个service的多个方法，甚至是可以调用其他的.do请求。
		List<Film> sList = filmService.queryFilm();
		
		if(result){
			//跳转到显示所有学生信息的页面
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
			//提示修改失败
			return "error.jsp";
		}
	}
	@RequestMapping("deleteFilm.do")
	public String deleteFilm(Film s){
		boolean bool = filmService.deleteFilm(s);
		if(bool){
			
			return "queryFilm.do";
			
		}else{
			//提示修改失败
			return "error.jsp";
		}
	}
	/*@RequestMapping("/queryFilm.do")
	public void queryFilm(){
		
	}
	*/
	

}

