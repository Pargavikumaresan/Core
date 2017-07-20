package com.dao;

import java.sql.Time;
import java.util.Scanner;

import com.model.Courses;

public class EditDao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses courses = new Courses();
		/*Time time = Time.valueOf("16:00:05");
		courses.setId(5);
		courses.setName("MySql");
		courses.setActive("yes");
		courses.setDuration(time);
		courses.setContent("Various types of Joins");
		*/
        CoursesDao dao = new CoursesDao();
		
        System.out.println(" 1. List all courses \n 2. List all active courses \n 3. List all inactive courses \n 4. Edit a course and its contents \n 5. Delete a course and its contents \n 6. Add a course and its contents \n 7. Exit ");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the next action menu (1 to 7):");
		int choice = s.nextInt();
		System.out.println();
		

	}
}
