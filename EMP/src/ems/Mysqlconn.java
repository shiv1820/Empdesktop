package ems;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysqlconn {
	
	Connection con=null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect() {
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/employee","root","tiger");
			return con;
		}
		catch(Exception e2){
			System.out.println(e2);
			return null;
		}
	}
}
