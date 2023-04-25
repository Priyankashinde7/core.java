package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsSelectTest4 {
	private static final String GET_ALL_EMPS="SELECT EMPID,ENAME,JOB,SAL FROM EMP WHERE SAL>=? AND SAL<=?";
	
	public static void main(String[] args) {
			try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","priyajayrang7");
					PreparedStatement ps=con.prepareStatement(GET_ALL_EMPS);
					){
				//SET THE QUERY PARAM VALUES
				if(ps!=null) {
					ps.setFloat(1, 1000.0f);
					ps.setFloat(2, 2000.0f);
				}
				
				//send and execute the SQL query
				try(ResultSet rs=ps.executeQuery()){
					//process the ResultSet obj(1 or 0 records)
					while(rs.next())
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3)+" "+rs.getDouble(4));
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		

	}

}
