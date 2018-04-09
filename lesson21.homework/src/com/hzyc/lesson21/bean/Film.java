package com.hzyc.lesson21.bean;

public class Film {
	private int id ;
	private String name;
	private String director;
	private String country;
	private int time;
	private String language;
	private String starttime;
	private String overtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", director=" + director
				+ ", country=" + country + ", time=" + time + ", language="
				+ language + ", starttime=" + starttime + ", overtime="
				+ overtime + "]";
	}
	

}
