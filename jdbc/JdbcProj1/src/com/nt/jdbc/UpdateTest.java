package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","priyajayrang7");
				Statement st = con.createStatement()){
			String newAddrs = null;
			float newAvg=0.0f;
			int no=0;
			
			if(sc!=null) {
				System.out.println("Enter student number::");
				no=sc.nextInt();//gives 132
				System.out.println("Enter new Address for the Student::");
				newAddrs=sc.next();//gives mumbai
				System.out.println("Enter new Avg for the student::");
				newAvg=sc.nextFloat();//gives 56.66
			}
			//convert the input value as required for the SQL Query
			newAddrs="'"+newAddrs+"'";
			
			//prepare the SQL Query
		}//try
	}//main

}//class
