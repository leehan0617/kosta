package bankConsol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;

public class AccountDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private String sql=null;
	private Scanner scan=null;
	private AccountDto account=null;
	
	public void printMenu(){
		System.out.println("-----Menu-----");
		System.out.println("|1.����          ����|");
		System.out.println("|2.��                ��|");
		System.out.println("|3.��                ��|");
		System.out.println("|4.�ܾ���ȸ(����)|");
		System.out.println("|5.�ܾ���ȸ(��ü)|");
		System.out.println("|6.��ü           ���|");
		System.out.println("|7.��                 ��|");
		System.out.println("---------------");
		System.out.print("�Է�:");
	}
	
	public void makeAccount(){
		scan=new Scanner(System.in);
		account=new AccountDto();
		
		System.out.print("���¹�ȣ:");
		account.setId(scan.next());
		System.out.print("�̸�:");
		account.setB_name(scan.next());
		System.out.print("�Աݾ�:");
		account.setBalance(scan.nextLong());
		
		try{
			conn=ConnectionProvider.getConnection();
			sql="insert into bank values(bank_num_seq.nextval,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getB_name());
			pstmt.setLong(3, account.getBalance());
			pstmt.executeUpdate();
			
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
		}catch(Exception e){
			System.out.println("���»��� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void inMoney(){
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		
		try{
			account=new AccountDto();
			System.out.print("�Ա��� ���¸� ������:");
			account.setId(scan.next());
			
			sql="select balance from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				System.out.print("�Ա��� �ݾ��� �Է��ϼ���:");
				int money=scan.nextInt();
				account.setBalance(rs.getInt("balance")+money);
				sql="update bank set balance="+account.getBalance()+"where id="+account.getId();
				pstmt=conn.prepareStatement(sql);
				pstmt.executeUpdate();
			}else{
				System.out.println("���°� �������� �ʽ��ϴ�.");
			}		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void outMoney(){
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);
		
		try{
			account=new AccountDto();
			System.out.print("����� ���¸� ������:");
			account.setId(scan.next());
			sql="select balance from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				System.out.print("����� �ݾ��� �Է��ϼ���:");
				int money=scan.nextInt();
				int temp=rs.getInt("balance");
				
				if(temp-money<0){
					System.out.println("�ܾ� ����");
					return;
				}
				
				account.setBalance(rs.getInt("balance")-money);
				sql="update bank set balance="+account.getBalance()+"where id="+account.getId();
				pstmt=conn.prepareStatement(sql);
				pstmt.executeUpdate();
				System.out.println("��ݿϷ�");
			}else{
				System.out.println("���°� �������� �ʽ��ϴ�.");
			}		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void showAllAccount(){
		conn=ConnectionProvider.getConnection();
		ArrayList<AccountDto> list=new ArrayList<AccountDto>();
		
		try{
			sql="Select * from bank order by num";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				account=new AccountDto();
				account.setNum(rs.getInt(1));
				account.setId(rs.getString(2));
				account.setB_name(rs.getString(3));
				account.setBalance(rs.getInt(4));
				list.add(account);
			}
			
			for(int i=0;i<list.size();i++){
				AccountDto ad=list.get(i);
				System.out.println(ad.getNum()+"\t"+ad.getId()+"\t"+ad.getB_name()+"\t"+ad.getBalance());
			}
			
		}catch(Exception e){
			System.out.println("��ü ��� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void showAllBalance(){
		conn=ConnectionProvider.getConnection();
		ArrayList<AccountDto> list=new ArrayList<AccountDto>();
		
		try{
			sql="Select b_name,balance from bank order by balance";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				account=new AccountDto();
				account.setB_name(rs.getString("b_name"));
				account.setBalance(rs.getLong("balance"));
				list.add(account);
			}
			
			for(int i=0;i<list.size();i++){
				account=list.get(i);
				System.out.println(account.getB_name()+"���� �ܾ�:"+account.getBalance());
			}
			
		}catch(Exception e){
			System.out.println("��ü�ܾ� ��ȸ ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void showSingleBalance(){
		conn=ConnectionProvider.getConnection();
		scan=new Scanner(System.in);

		try{
			account=new AccountDto();
			System.out.print("���¹�ȣ�� �Է��ϼ���:");
			account.setId(scan.next());
			
			sql="Select id,balance from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				account.setBalance(rs.getLong("balance"));
			}
			
			System.out.println(account.getId()+"������ �ܾ�:"+account.getBalance());
			
		}catch(Exception e){
			System.out.println("���°� ���������ʽ��ϴ�.");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}
