package sevlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationJdbc {
	
	public  void insert(RegestrationDetails obj) throws Exception {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		
		String url="jdbc:mysql://192.168.0.107:3306/CODEBEGUN_TEST_DB";
		String userName="root";
		String password="root";
		String query="select * from registrationdetails";
		String insertquery="insert into registrationdetails(FIRSTNAME,LASTNAME,EMAILID,MOBILENUMBER)"
				+"values(?,?,?,?)";
	try {
			connection=DriverManager.getConnection(url, userName, password);
			statement=connection.prepareStatement(insertquery);
			statement.setString(1,obj.getFirstname());
			statement.setString(2,obj.getLastname());
			statement.setString(3,obj.getEmail());
			statement.setString(4,obj.getMobile());
			int noofrows=statement.executeUpdate();
			System.out.println(noofrows);
//			resultSet=statement.executeQuery(query);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	finally {
		connection.close();
		statement.close();
	}
	}
	}
	


