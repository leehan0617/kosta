package sungjuk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;

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
		try{
			
			System.out.print("�й�������:");
			sjd=new SungjukDto();
			sjd.setHakbun(scan.nextInt());
			
			sql="select * from mysungjuk where hakbun=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, sjd.getHakbun());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				sjd.setName(rs.getString("name"));
				sjd.setKor(rs.getInt("kor"));
				sjd.setEng(rs.getInt("eng"));
				sjd.setMat(rs.getInt("mat"));
				sjd.setTot(rs.getInt("tot"));
				sjd.setAvg(rs.getFloat("avg"));
				System.out.println(sjd.getHakbun()+"\t"+sjd.getName()+"\t"+sjd.getKor()+"\t"+sjd.getEng()+"\t"+sjd.getMat()+"\t"+sjd.getTot()+"\t"+sjd.getAvg());
			}else{
				System.out.println("�й��� �������� �ʽ��ϴ�.");
			}
			
		}catch(Exception e){
			System.out.println("2�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void totalScoreAndAvg() {
		conn=ConnectionProvider.getConnection();
		try{
			sql="select sum(tot) sa,round(avg(avg),1) aver from mysungjuk";
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				System.out.println("������:"+rs.getInt("sa")+"�����:"+rs.getFloat("aver"));
			}
		}catch(Exception e){
			System.out.println("3�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

	public void printAllSungjuk() {
		conn=ConnectionProvider.getConnection();
		ArrayList<SungjukDto> list=new ArrayList<SungjukDto>();
		
		try{
			sql="select * from mysungjuk order by tot desc";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				sjd=new SungjukDto();
				sjd.setHakbun(rs.getInt("hakbun"));
				sjd.setName(rs.getString("name"));
				sjd.setKor(rs.getInt("kor"));
				sjd.setEng(rs.getInt("eng"));
				sjd.setMat(rs.getInt("mat"));
				sjd.setTot(rs.getInt("tot"));
				sjd.setAvg(rs.getFloat("avg"));
				
				list.add(sjd);
			}
			
			for(int i=0;i<list.size();i++){
				sjd=list.get(i);
				System.out.println(sjd.getHakbun()+"\t"+sjd.getName()+"\t"+sjd.getKor()+"\t"+sjd.getEng()+"\t"+sjd.getMat()+"\t"+sjd.getTot()+"\t"+sjd.getAvg());
			}
			
		}catch(Exception e){
			System.out.println("4�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

	public void bestWorstPrint() {
		conn=ConnectionProvider.getConnection();
		sjd=new SungjukDto();
		ArrayList<String> list=new ArrayList<String>();
		
		try{
			sql="select name from mysungjuk order by tot desc";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				String input=rs.getString("name");
				list.add(input);
			}
			
			for(int i=0;i<list.size();i++){
				if(i==0){
					sjd.setName(list.get(i));
					System.out.println("�ϵ�:"+sjd.getName());
					
				}
				if(i==list.size()-1){
					sjd.setName(list.get(i));
					System.out.println("�õ�:"+sjd.getName());
				}
			}
			
		}catch(Exception e){
			System.out.println("5�� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}

}
