package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("driver error");
			e.printStackTrace();
		}
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr";
		String pwd="1234";
		
		try {
			Connection conn=DriverManager.getConnection(url, id, pwd);
			String sql="SELECT employee_id,first_name,last_name FROM EMPLOYEES";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()){
				int eId=rs.getInt("employee_id");
				String fn=rs.getString("first_name");
				String ln=rs.getString("last_name");
				
				System.out.println(eId+"\t"+fn+"\t"+ln);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		}
	}
}
