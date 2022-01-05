package com.jdbc_example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ch;
		char v;
		
		BussLayer buss = new BussLayer();
		
		System.out.println("Enter your choice to update\n a)Create Record\n b)Update Record\n c)Delete Record\n");
		
		Scanner sc = new Scanner(System.in);
		v = sc.next().charAt(0);
		// TODO Auto-generated method stub
		
		switch(v) {
		
		case 'a': buss.insertData(3, "Chinmay", "2012-02-03", "2012-02-03");
				buss.selectData();
				break;
			
		case 'b':
				System.out.println("Enter 1) Upadte Name 2) Update DOB 3) Update DOJ");
				ch = sc.nextInt();
				do {
					if(ch == 1) {
						buss.updateName(2, "Prasad");
						buss.selectData();
					}
					else if(ch == 2) {
						buss.updateDOB(2, "2001-01-01");
						buss.selectData();
						}
					else if(ch == 3) {
						buss.updateDOJ(2, "2020-04-05");
						buss.selectData();
					}
	        	System.out.println("Do you want to update anything else? press 0");
	        	ch = sc.nextInt();
		
				}while(ch == 0);
				break;
		
	
		case 'c':buss.deleteData(2);
				 buss.selectData();
				 break;
				 
		default: System.out.println("Invalid Input!!!!");
	}
	System.out.println("THANK YOUUUU!!!!!!");
  }
	
}
