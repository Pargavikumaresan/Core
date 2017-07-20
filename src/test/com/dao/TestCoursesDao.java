package test.com.dao;

import java.sql.Time;
import java.util.Scanner;

import com.dao.CoursesDao;
import com.model.Courses;

public class TestCoursesDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses courses = new Courses();

          
		Time time = Time.valueOf("40:00:00");
		courses.setId(2);
		courses.setName("MySql");
		courses.setActive("yes");
		courses.setDuration(time);
		courses.setContent("Various types of Joins");
		
		CoursesDao dao = new CoursesDao();
		
		// Admin can insert courses

		try {
			dao.insert(courses);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/* Admin can upload the contents of book */
		try {
			dao.update(courses);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		 //Admin can view all courses
		try {
			dao.listAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Author can view the all active courses 
		try {
			dao.listAllActiveCourses();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Author can view the all inactive courses 
		try {
			dao.listAllInActiveCourses();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Admin can delete courses
					try {
						Scanner s1 = new Scanner(System.in);
						System.out.println("Enter the course id to delete:");
						int id = s1.nextInt();
						dao.removeCourse(id);
					} catch (Exception e) {
						e.printStackTrace();
					} 
					
	
	
	
	
	}




	}


