package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeAgeCalculator_Oracle {
	private static final String	ORACLE_AGE_CALCULATOR="SELECT(SYSDATE-DOB)/365.0 FROM EMP WHERE EID = ?";
	

	public static void main(String[] args) {
		try(Scaneer sc =new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","priyajayrang7");
				PreparedStatement ps = con.prepareStatement(ORACLE_AGE_CALCULATOR);
				){
			
		}
		// 

	}

}
