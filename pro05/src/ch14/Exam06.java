package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner scan=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pwd="tiger";
			conn=DriverManager.getConnection(url, id, pwd);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			System.out.print("이름:");
			scan=new Scanner(System.in);
			String name=scan.next();
			
			String sql="select * from sungjuk where name=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();

			if(rs.next()){
				System.out.println(rs.getString("name")+"\t"+rs.getInt("kor"));
				System.out.print("새로운 국어 점수 입력");
				int nKor=scan.nextInt();
				
				String upSql="update sungjuk set kor=? where name=?";
				pstmt=conn.prepareStatement(upSql);
				pstmt.setInt(1, nKor);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("업데이트 완료");
			}else{
				System.out.println("존재안함");
			}
			
			scan.close();
		}catch(Exception e){
			System.out.println("Query Error");
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				System.out.println("finish");
			}catch(Exception e){
				System.out.println("Close Error");
			}
		}
	}
}
