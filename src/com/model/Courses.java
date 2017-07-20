package com.model;

import java.sql.Time;

public class Courses {
	private int id;
	private String name;
	private Time duration;
	private String active;
	private String content;
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
	public Time getDuration() {
		return duration;
	}
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", duration=" + duration + ", active=" + active + ", content="
				+ content + "]";
	}
	/*public Courses(int id, String name, LocalTime duration, String active, String content) {
		//super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.active = active;
		this.content = content;
	}
	*/

}
