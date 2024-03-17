package Jdbcprogrames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcOne {

	public static void main(String[] args)throws SQLException{
		// TODO Auto-generated method stub
	Connection	connection =null;
	ResultSet resultset=null;
	PreparedStatement statement=null;
		int studentid=3;
		String url="jdbc:mysql://192.168.0.122:3306/CODEBEGUN_TEST_DB";
		String username="root";
		String password="root";
		String query="select * from STUDENT_DETAILS";
		String insertquery="insert into STUDENT_DETAILS(FIRSTNAME,LASTNAME,MOBILENUMBER,EMAILID,GENDER,ACTIVE_STATUS,CREATE_USER,UPDATED_USER)"
				 +"VALUES(?,?,?,?,?,?,?,?)";
		
		try {
			connection=DriverManager.getConnection(url,username,password);
			statement=connection.prepareStatement(insertquery);
			statement.setString(1,"varsha");
			statement.setString(2,"sapa");
			statement.setLong(3,9014200511L);
			statement.setString(4,"varshasapa@gmail.com");
			statement.setString(5,"F");
			statement.setBoolean(6,true);
			statement.setString(7,"SYSTEM");
			statement.setString(8,"SYSTEM");
			int noofrows=statement.executeUpdate();
			System.out.println(noofrows);
//			statement=connection.createStatement();
//			resultset=statement.executeQuery(query);
//			while(resultset.next()) {
//			System.out.println(resultset.getString("LASTNAME"));
//			
//			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			connection.close();
			statement.close();
//			resultset.close();
		}

	}

}
