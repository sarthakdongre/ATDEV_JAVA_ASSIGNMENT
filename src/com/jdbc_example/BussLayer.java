package com.jdbc_example;

public class BussLayer {
	
	private StudentDB sdb;
	
	public BussLayer() {
		sdb = new StudentDB();
	}
	
	public void selectData() {
		 
		sdb.selectRecords();
	}
	
	public void insertData(int sid , String name , String dob , String doj) {
		
		String cmd = "insert into student(STUDENT_NO , STUDENT_NAME , STUDENT_DOB , STUDENT_DOJ) values('"+sid+"','"+name+"','"+dob+"','"+doj+"')"; 
		if(sdb.recordsManipulation(cmd))
			System.out.println("Records have been saved successfully!!!");
		else
			System.out.println("Records have not been saved successfully!!!");
	}

	public void updateName(int sid , String name) {
		String cmd = "update student set STUDENT_NAME = '"+name+"' where STUDENT_NO='"+sid+"'"; 
		if(sdb.recordsManipulation(cmd))
			System.out.println("Name have been updated successfully!!!");
		else
			System.out.println("Name have not been updated successfully!!!");
	}
	
	public void updateDOB(int sid , String dob) {
		String cmd = "update student set STUDENT_DOB = '"+dob+"' where STUDENT_NO='"+sid+"'"; 
		if(sdb.recordsManipulation(cmd))
			System.out.println("Date of Birth have been updated successfully!!!");
		else
			System.out.println("Date of Birth have not been updated successfully!!!");
	}
	
	public void updateDOJ(int sid , String doj) {
		String cmd = "update student set STUDENT_DOJ = '"+doj+"' where STUDENT_NO='"+sid+"'"; 
		if(sdb.recordsManipulation(cmd))
			System.out.println("Date of Join have been updated successfully!!!");
		else
			System.out.println("Date of join have not been updated successfully!!!");
	}
	
	public void deleteData(int sid) {
		String cmd = "delete from student where STUDENT_NO='"+sid+"'"; 
		if(sdb.recordsManipulation(cmd))
			System.out.println("Record have been deleted successfully!!!");
		else
			System.out.println("Record have not been deleted successfully!!!");
	}
}
   