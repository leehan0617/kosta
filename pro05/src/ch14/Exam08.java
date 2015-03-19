package ch14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import dbUnit.ConnectionProvider;
import dbUnit.DriverProvider;
import dbUnit.JdbcUtil;

public class Exam08 {
	public static void main(String[] args){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DriverProvider.getDriver();
		conn=ConnectionProvider.getConnection();
		
		try{
			String sql="Select * from person";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				int bunho=rs.getInt("bunho");
				String name=rs.getString("p_name");
				String phone=rs.getString("phone");
				String jumin=rs.getString("jumin");
				String city=rs.getString("city");
				Date date=rs.getDate("birth");
		
				System.out.println(bunho+"\t"+name+"\t"+phone+"\t"+jumin+"\t"+city+"\t"+date.toString());
			}
		}catch(SQLException e){
			System.out.println("Query Error");
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);	
		}
	}
}