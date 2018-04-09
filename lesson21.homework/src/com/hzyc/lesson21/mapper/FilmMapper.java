package com.hzyc.lesson21.mapper;

import java.util.List;

import com.hzyc.lesson21.bean.Film;



public interface FilmMapper {
     public int insertFilm(Film s);
	
	public List<Film> queryFilm();
    public Film queryFilmById(String id);
    public  Film queryFilmById1(String id);
	
	public int updateFilm(Film s);
	public int deleteFilm(Film s);


}
