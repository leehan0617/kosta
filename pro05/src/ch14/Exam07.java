package ch14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import dbUnit.*;

public class Exam07 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner scan=null;
		
		DriverProvider.getDriver();
	
		try{
			scan=new Scanner(System.in);
			conn=ConnectionProvider.getConnection();
			
			System.out.print("��ȣ:");
			int bunho=scan.nextInt();
			System.out.print("�̸�:");
			String name=scan.next();
			System.out.print("��ȭ��ȣ:");
			String phone=scan.next();
			System.out.print("�ֹι�ȣ:");
			String jumin=scan.next();
			System.out.print("��°�:");
			String city=scan.next();
			System.out.print("����:");
			String birth=scan.next();
			
//			String sql="insert into person values(?,?,?,?,?,to_date(?,'yyyy-mm-dd'))";
			String sql="insert into person values(?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bunho);
			pstmt.setString(2, name);
			pstmt.setString(3, phone);
			pstmt.setString(4, jumin);
			pstmt.setString(5, city);
//			pstmt.setString(6,birth);
			SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd");
			java.util.Date date=sdf.parse(birth);
			pstmt.setDate(6,new java.sql.Date(date.getTime()));
			
			pstmt.executeUpdate();
			System.out.println("������ ���Լ���");
		}catch(Exception e){
			System.out.println("Query Error");
			e.printStackTrace();
		}finally{
			if(scan!=null)scan.close();
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}
