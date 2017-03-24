package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtill {
	public static final String url="jdbc:Oracle:thin:@inchnilpdb03.India.TCS.com:1521:JavaDB03";
	public static final String user_name="E1196388";
	public static final String  password="E1196388";
static Connection con=null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection(url, user_name, password);
		return con;
	}
	
	public static  void closeConnection(Connection con) {
		try{
			if(con!=null)
				con.close();
		}
		catch (Exception e) {
				System.out.println(e);
		}
	}
	
	
	public static  void closePreparedStatement(PreparedStatement ps) {
		try{
			if(ps!=null)
				ps.close();
		}
		catch (Exception e) {
				System.out.println(e);
		}
	}
	
	public static  void closeResultSet(ResultSet ps) {
		try{
			if(ps!=null)
				ps.close();
		}
		catch (Exception e) {
				System.out.println(e);
		}
	}
}
