import java.sql.*;
public class SelectTest
{
	public static void main(String[] args) throws Exception 
	{
		//load jdbc driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","priyajayrang7");
		//create jdbc Statement obj
		Statement st = con.createStatement();
		//send and execute the SELECT SQL Query to DB s/w
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");
		//process the ResultSet obj
		while(rs.next()!=false){
			System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getFloat(4));
		}
		//close jdbc objs
		rs.close();
		st.close();
		con.close();

	}//main
}//class
