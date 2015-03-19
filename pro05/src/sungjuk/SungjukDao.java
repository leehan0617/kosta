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
		System.out.println("-------------메뉴------------");
		System.out.println("|1.성적 입력                     |");
		System.out.println("|2.개인성적출력                   |");
		System.out.println("|3.반총점,평균                    |");
		System.out.println("|4.성적순 출력                    |");
		System.out.println("|5.일등 꼴등 출력                   |");
		System.out.println("|6.종료                            |");
		System.out.println("------------------------------");
		System.out.print("입력:");
	}
	
	public void inputSungjuk() {
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		sjd=new SungjukDto();
		
		try{
			System.out.print("학번:");
			sjd.setHakbun(scan.nextInt());
			
			System.out.print("이름:");
			sjd.setName(scan.next());
			
			System.out.print("국어:");
			sjd.setKor(scan.nextInt());
			
			System.out.print("수학:");
			sjd.setKor(scan.nextInt());
			
			System.out.print("영어:");
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
			System.out.println("입력이 성공하였습니다.");
		}catch(Exception e){
			System.out.println("1번 에러");
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
			System.out.print("학번 입력:");
			sjd.setHakbun(scan.nextInt());
			
			sql="select * from mysungjuk where hakbun=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sjd.getHakbun());
			pstmt.executeQuery();
			
		}catch(Exception e){
			System.out.println("1번 에러");
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
			System.out.println("1번 에러");
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
			System.out.println("1번 에러");
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
			System.out.println("1번 에러");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}
