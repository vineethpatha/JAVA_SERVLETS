package Jdbcprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CreateTable {
//	half completed program

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		
		String url="jdbc:mysql://192.168.0.122:3306/CODEBEGUN_TEST_DB";
		String userName="root";
		String password="root";
		String query="select * from registrationdetails";
		String insertquery="insert into registrationdetails(FIRSTNAME,LASTNAME,EMAIL,MOBILENUMBER)"
				+"values(?,?,?,?)";
	try {
			connection=DriverManager.getConnection(url, userName, password);
			statement=connection.prepareStatement(insertquery);
			statement.setString(1,"vineeth");
			statement.setString(2,"patha");
			statement.setString(3,"vinith@gmail.com");
			statement.setLong(4,9014200511L);
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
	