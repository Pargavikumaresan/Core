package test.com.model;

import java.sql.Time;

import com.model.Courses;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses courses = new Courses();
		Time time = Time.valueOf("40:30:05");
		courses.setId(1);
		courses.setName("MySql");
		courses.setActive("yes");
		courses.setDuration(time);
		courses.setContent("Various types of Joins");
		System.out.println(courses);

	}

}
