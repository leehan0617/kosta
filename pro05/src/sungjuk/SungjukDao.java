package sungjuk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import dbUnit.*;

public class SungjukDao {
	Scanner scan=null;
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String sql=null;
	SungjukDto sjd=null;
	
	public void init(){
		System.out.println("-------------�޴�------------");
		System.out.println("|1.���� �Է�                     |");
		System.out.println("|2.���μ������                   |");
		System.out.println("|3.������,���                    |");
		System.out.println("|4.������ ���                    |");
		System.out.println("|5.�ϵ� �õ� ���                   |");
		System.out.println("|6.����                            |");
		System.out.println("------------------------------");
		System.out.print("�Է�:");
	}
	
	public void inputSungjuk() {
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		sjd=new SungjukDto();
		
		try{
			System.out.print("�й�:");
			sjd.setHakbun(scan.nextInt());
			
			System.out.print("�̸�:");
			sjd.setName(scan.next());
			
			System.out.print("����:");
			sjd.setKor(scan.nextInt());
			
			System.out.print("����:");
			sjd.setKor(scan.nextInt());
			
			System.out.print("����:");
			sjd.setKor(scan.nextInt());
			
			sjd.setTot(sjd.getKor()+sjd.getEng()+sjd.getMat());
			sjd.setAvg(sjd.getTot()/3.0f);
			
			sql="insert into mysungjuk values(?,?,?,?,?,?,?,mysungjuk_idx_seq.nextval)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, sjd.getHakbun());
			pstmt.setString(2, sjd.getName());
			pstmt.setInt(3, sjd.getKor());
			pstmt.setInt(4,sjd.getEng());
			pstmt.setInt(5, sjd.getMat());
			pstmt.setInt(6, sjd.getTot());
			pstmt.setFloat(7, sjd.getAvg());
			
			pstmt.executeUpdate();
			System.out.println("�Է��� �����Ͽ����ϴ�.");
		}catch(Exception e){
			System.out.println("1�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void printSingleSungjuk() {
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		SungjukDto sjd=null;
		
		try{
			sjd=new SungjukDto();
			System.out.print("�й� �Է�:");
			sjd.setHakbun(scan.nextInt());
			
			sql="select * from mysungjuk where hakbun=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sjd.getHakbun());
			pstmt.executeQuery();
			
		}catch(Exception e){
			System.out.println("1�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

	public void bestWorstPrint() {
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		try{
			
		}catch(Exception e){
			System.out.println("1�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

	public void printAllSungjuk() {
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		try{
			
		}catch(Exception e){
			System.out.println("1�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

	public void totalScoreAndAvg() {
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		try{
			
		}catch(Exception e){
			System.out.println("1�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}
