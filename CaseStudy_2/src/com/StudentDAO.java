package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DataBaseUtill;

public class StudentDAO 
{
	    boolean inserted=false;
	    int Did=-1;
		Connection con = null;
		PreparedStatement ps = null;
	    ResultSet rs=null;
		public int addStudent(Student student) {
			System.out.println("gnh");
			
			try {
				con =DataBaseUtill.getConnection();
				ps=con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
				
				ps.setString(1,student.getFirstName());
				ps.setString(2,student.getLastName());
				ps.setString(3,student.getAddress());
				ps.setString(4,student.getGender());
				ps.setString(5,student.getCourse());
				ps.setString(6, student.getDepartment());
				int result=ps.executeUpdate();
				if(result>0)
				{
					inserted=true;
					ps=con.prepareStatement("Select fname from student");
					rs=ps.executeQuery();
					while(rs.next())
					{
						Did=rs.getInt(1);
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			
			}
			finally{
				DataBaseUtill.closeConnection(con);
				DataBaseUtill.closePreparedStatement(ps);
			}
			
			return Did;
		}
}
