package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam03 {
	public static void main(String[] args) {
		//데이터베이스 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("driver error");
			e.printStackTrace();
		}
		
		//연결을관리하는 객체
		Connection conn=null;
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="hr";
			String pwd="1234";
			conn=DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		}
		
		//작업관리
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			String sql="select employee_id,first_name,last_name from employees";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				int eId=rs.getInt("employee_id");
				String fn=rs.getString("first_name");
				String ln=rs.getString("last_name");
				
				System.out.println(eId+"\t"+fn+"\t"+ln);
			}
		}catch(SQLException e){
			System.out.println("SQL Error");
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}