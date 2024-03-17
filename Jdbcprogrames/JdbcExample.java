package Jdbcprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args)throws SQLException {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		String url="jdbc:mysql://192.168.0.122:3306/CODEBEGUN_TEST_DB";
		String userName="root";
		String password="root";
		String query="select * from address";
		try {
			
//			Class.forName("com.mysql.cj.jdbc.Driver"); 
			connection=DriverManager.getConnection(url, userName, password);
			statement=connection.createStatement();
			resultSet=statement.executeQuery(query);
			while(resultSet.next())
			{
				System.out.println(resultSet.getString("address1"));
			}
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally {
			connection.close();
			statement.close();
			resultSet.close();
		}

	}
}