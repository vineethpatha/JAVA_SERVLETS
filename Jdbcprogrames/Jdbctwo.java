package Jdbcprogrames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbctwo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection	connection =null;
		PreparedStatement statement=null;
		Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NO.OF ROWS");

int a=sc.nextInt();
int b[]=new int[a];
int c[]=new int[a];
//String[] employeeid=new String[a];
String[] address1=new String[a];
String[] address2=new String[a];
for(int i=0;i<a;i++) {
	System.out.println("enter address id");
	b[i]=sc.nextInt();
	System.out.println("ENTER EMPLOYEE ID");
	c[i]=sc.nextInt();
	System.out.println("enter address1");
	address1[i]=sc.next();
	System.out.println("enter address2");
	address2[i]=sc.next();

	
}
String url="jdbc:mysql://192.168.0.122:3306/CODEBEGUN_TEST_DB";
String username="root";
String password="root";
String query="select * from address";
String insertquery="insert into STUDENT_DETAILS(address_ID,employe_id,address1,address2)"
		 +"VALUES(?,?,?,?)";
try {
	for(int i=0;i<a;i++) {
		statement.setInt(1,b[i]);
		statement.setInt(2,c[i]);
		statement.setString(3,address1[i]);
		statement.setString(4,address2[i]);
		int noofrows=statement.executeUpdate();
		System.out.println(noofrows);
	}
}catch(Exception e){
	e.printStackTrace();
}finally {
	statement.close();
	connection.close();
}

	}

}
