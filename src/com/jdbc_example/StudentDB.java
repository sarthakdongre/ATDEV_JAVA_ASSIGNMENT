package com.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;




public class StudentDB {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/stud_db";
	private String uid = "root";
	private String passwd = "";

	public void selectRecords(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uid, passwd);
			Statement smt = con.createStatement();
			ResultSet result = smt.executeQuery("select * from student");
			
			while(result.next()) {
				System.out.println("ID :"+result.getInt(1));
				System.out.println("Student Name: "+result.getString(2));
				System.out.println("Student DOB: "+result.getDate("STUDENT_DOB"));
				System.out.println("Student DOJ: "+result.getDate("STUDENT_DOJ"));
				System.out.println("********************************************");
			}
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	public boolean recordsManipulation(String query){
		
		boolean flag = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uid, passwd);
			Statement smt = con.createStatement();
			flag = smt.executeUpdate(query) > 0 ? true : false;
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return flag; 
	}
}
