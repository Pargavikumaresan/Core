package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.model.Courses;

import com.util.ConnectionUtil;

public class CoursesDao {
	
//	Courses course = new Courses();
	Connection con = ConnectionUtil.getConnection();
	
	public Courses insert(Courses courses){
		//Connection con = ConnectionUtil.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("insert into courses (name,duration,active,content) values(?,?,?,?)");
			pst.setString(1, courses.getName());
			pst.setTime(2, courses.getDuration());
			pst.setString(3, courses.getActive());
			pst.setString(4,courses.getContent());
			int rows = pst.executeUpdate();
			System.out.println(courses);
			System.out.println(rows+ " rows inserted successfully");
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
	}
	
	public void removeCourse(int id) {
		//Connection con = ConnectionUtil.getConnection();
		Courses courses = new Courses();
        String sql = "delete from courses where ID=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			
			int rows = pst.executeUpdate();
			System.out.println(rows+"  Rows are Deleted successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	
	public Courses update(Courses courses){
	//	Connection con = ConnectionUtil.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("update courses set content = ? where id = ? and name=? and active= ? and duration=?");
		    pst.setString(1, courses.getContent());	
			pst.setInt(2, courses.getId());
			pst.setString(3,courses.getName());
			pst.setString(4, courses.getActive());
			pst.setTime(5,courses.getDuration());
			int rows = pst.executeUpdate();
			System.out.println(courses);
			System.out.println(rows+" rows updated successfully");
			System.out.println();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
		}
	
	public void listAll() {
		//Connection con = ConnectionUtil.getConnection();
		
		String sql = "select * from courses";
		PreparedStatement pst;
		System.out.println("List of all courses");
		System.out.println();
		
		try {
			pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		  
			while (rs.next()) {
				Courses course = new Courses();
				course.setId(rs.getInt("id"));
				course.setName(rs.getString("name"));
				course.setContent(rs.getString("content"));
				course.setActive(rs.getString("active"));
				course.setDuration(rs.getTime("duration"));
				/*
			    System.out.println("id = "+ course.getId());
				System.out.println("name = "+ course.getName());
				System.out.println("content = "+ course.getContent());
				System.out.println("active = "+ course.getActive());
				System.out.println("Duration = "+ course.getDuration());
				*/
				System.out.println(course);
				
			}
           
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
		
	
	public void listAllActiveCourses() {
			//Connection con = ConnectionUtil.getConnection();
			
			String sql = "select * from courses where active = 'yes'";
			PreparedStatement pst;
			System.out.println("List of all active courses");
			System.out.println();
			
			try {
				pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
			  
				while (rs.next()) {
					Courses course = new Courses();
					course.setId(rs.getInt("id"));
					course.setName(rs.getString("name"));
					course.setContent(rs.getString("content"));
					course.setActive(rs.getString("active"));
					course.setDuration(rs.getTime("duration"));
				   
					System.out.println(course);
					
				}
	           
				
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
	}
			
			public void listAllInActiveCourses() {
				//Connection con = ConnectionUtil.getConnection();
				
				String sql = "select * from courses where active = 'no'";
				PreparedStatement pst;
				System.out.println("List of all inactive courses");
				System.out.println();
				
				try {
					pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
				  
					while (rs.next()) {
						Courses course = new Courses();
						course.setId(rs.getInt("id"));
						course.setName(rs.getString("name"));
						course.setContent(rs.getString("content"));
						course.setActive(rs.getString("active"));
						course.setDuration(rs.getTime("duration"));
					   
						System.out.println(course);
						
					}
		           
					
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println();
		
		
		
				
	}
			
			/*public void selectOne(){
				//String sql = "select * from courses where id =?";
				PreparedStatement pst;
				
				System.out.println("List of selected courses");
				System.out.println();
				
				try {
					Courses courses = new Courses();
					pst = con.prepareStatement("select * from courses where id =?");
					pst.setInt(1,courses.getId());
					ResultSet rs = pst.executeQuery();
					
					//while (rs.next()) {
					//	Courses courses = new Courses();
						courses.setId(rs.getInt("id"));
						courses.setName(rs.getString("name"));
						courses.setContent(rs.getString("content"));
						courses.setActive(rs.getString("active"));
						courses.setDuration(rs.getTime("duration"));
					   
						System.out.println(courses);
						
				//	}
					//System.out.println(courses);
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
		}
			
	
	*/
	
	
}
