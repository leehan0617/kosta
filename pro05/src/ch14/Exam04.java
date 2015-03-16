package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam04 {
	public static void main(String[] args) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver Error");
				e.printStackTrace();
			}
			
			try {
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String id="hr";
				String pwd="1234";
				
				conn=DriverManager.getConnection(url, id, pwd);
			} catch (SQLException e) {
				System.out.println("connection error");
				e.printStackTrace();
			}
			
			try {
				String sql="select * from jobs";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery(sql);
				
				while(rs.next()){
				   String job_id=rs.getString("job_id");
				   String job_title=rs.getString("job_title");
				   int min_salary=rs.getInt("min_salary");
				   int max_salary=rs.getInt("max_salary");
				   System.out.println(job_id+"\t"+job_title+"\t"+min_salary+"\t"+max_salary);
				}
			} catch (Exception e) {
				System.out.println("Query Error");
				e.printStackTrace();
			} finally{
				try{
					if(rs   !=null)	rs.close();
					if(pstmt!=null)	pstmt.close();
					if(conn !=null)	conn.close();
				}catch(Exception e){
					System.out.println("Close Error");
					e.printStackTrace();
				}
			}
	}
}