package test.com.dao;

import java.sql.Time;
import java.util.Scanner;

import com.dao.CoursesDao;
import com.model.Courses;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses courses = new Courses();

          
		Time time = Time.valueOf("16:00:05");
		courses.setId(5);
		courses.setName("MySql");
		courses.setActive("yes");
		courses.setDuration(time);
		courses.setContent("Various types of Joins");
		
        CoursesDao dao = new CoursesDao();
		
        System.out.println(" 1. List all courses \n 2. List all active courses \n 3. List all inactive courses \n 4. Edit a course and its contents \n 5. Delete a course and its contents \n 6. Add a course and its contents \n 7. Exit ");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the next action menu (1 to 7):");
		int choice = s.nextInt();
		System.out.println();
		switch(choice){
		case 1:
			 //Admin can view all courses 
			try {
				dao.listAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
				case 2:
			//Author can view the all active courses 
					try {
						dao.listAllActiveCourses();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3: 
					// Author can view the all inactive courses 
					try {
						dao.listAllInActiveCourses();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
				
				case 4:
					
					 //Admin can update the courses 
					try {
						dao.update(courses);
					} catch (Exception e) {
						e.printStackTrace();
					} 
					
					break;
								 
		case 5:
			// Admin can delete courses
			try {
				Scanner s1 = new Scanner(System.in);
				System.out.println("Enter the course id to delete: ");
				int id = s1.nextInt();
				System.out.println("Are you sure to delete the course (Y/N): ");
				String alert = s1.next(); 
				if(alert.equals("Y")){
				dao.removeCourse(id);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			break;
			
          case 6:
			
			// Admin can insert courses 
			
			try {
				dao.insert(courses);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			break;
		
		

		case 7:
			System.out.println("Thank you for enrolling this course");
			break;

			
			
		}

		
	}

}
