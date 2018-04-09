package com.hzyc.lesson21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzyc.lesson21.bean.Film;
import com.hzyc.lesson21.mapper.FilmMapper;


@Service
public class FilmService {

	@Autowired
	private FilmMapper filmMapper;

	//开发技巧：通常service的方法名可以和接口中的方法名一致。
	public boolean insertFilm(Film s){
		boolean result = false;
		try {
			//开发常识：
			int row = filmMapper.insertFilm(s);
			if(row > -1){
				result = true;
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}
	
	
	
	public List<Film> queryFilm(){
		 return filmMapper.queryFilm();
		
	}
	
	public Film queryFilmById(String id){
		return filmMapper.queryFilmById(id);
		
	}
	public Film queryFilmById1(String id){
		return filmMapper.queryFilmById1(id);
		
	}
	
	public boolean updateFilm(Film s){
		int result = filmMapper.updateFilm(s);
		if(result > -1){
			return true;
		}
		
		
		return false;
	}
	public boolean deleteFilm(Film s){
		int result = filmMapper.deleteFilm(s);
		if(result > -1){
			return true;
		}
		
		
		return false;
	}
}

