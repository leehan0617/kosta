package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner scan=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			System.out.println("driver error");
			e.printStackTrace();
		}
		
		try{
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pwd="tiger";
			
			conn=DriverManager.getConnection(url, id, pwd);
		}catch(SQLException e){
			System.out.println("Connection error");
			e.printStackTrace();
		}
		
		try{
			scan=new Scanner(System.in);
			System.out.print("이름:");
			String name=scan.next();
			System.out.print("번호:");
			String number=scan.next();
			System.out.print("주소:");
			String addr=scan.next();
			System.out.print("이메일:");
			String email=scan.next();
			
			String sql="insert into addr values(?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, number);
			pstmt.setString(3, addr);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			System.out.println("완료");
			
		}catch(Exception e){
			System.out.println("Query Error");
			e.printStackTrace();
		}finally{
			try{
				if(scan!=null)scan.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
	}
}