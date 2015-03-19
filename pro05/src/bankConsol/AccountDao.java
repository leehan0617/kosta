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
		System.out.println("|1.계좌          개설|");
		System.out.println("|2.입                금|");
		System.out.println("|3.출                금|");
		System.out.println("|4.잔액조회(개인)|");
		System.out.println("|5.잔액조회(전체)|");
		System.out.println("|6.전체           출력|");
		System.out.println("|7.종                 료|");
		System.out.println("---------------");
		System.out.print("입력:");
	}
	
	public void makeAccount(){
		scan=new Scanner(System.in);
		account=new AccountDto();
		
		System.out.print("계좌번호:");
		account.setId(scan.next());
		System.out.print("이름:");
		account.setB_name(scan.next());
		System.out.print("입금액:");
		account.setBalance(scan.nextLong());
		
		try{
			conn=ConnectionProvider.getConnection();
			sql="insert into bank values(bank_num_seq.nextval,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getB_name());
			pstmt.setLong(3, account.getBalance());
			pstmt.executeUpdate();
			
			System.out.println("계좌 개설이 완료되었습니다.");
		}catch(Exception e){
			System.out.println("계좌생성 에러");
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
			System.out.print("입금할 계좌를 쓰세요:");
			account.setId(scan.next());
			
			sql="select balance from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				System.out.print("입금할 금액을 입력하세요:");
				int money=scan.nextInt();
				account.setBalance(rs.getInt("balance")+money);
				sql="update bank set balance="+account.getBalance()+"where id="+account.getId();
				pstmt=conn.prepareStatement(sql);
				pstmt.executeUpdate();
			}else{
				System.out.println("계좌가 존재하지 않습니다.");
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
			System.out.print("출금할 계좌를 쓰세요:");
			account.setId(scan.next());
			sql="select balance from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				System.out.print("출금할 금액을 입력하세요:");
				int money=scan.nextInt();
				int temp=rs.getInt("balance");
				
				if(temp-money<0){
					System.out.println("잔액 부족");
					return;
				}
				
				account.setBalance(rs.getInt("balance")-money);
				sql="update bank set balance="+account.getBalance()+"where id="+account.getId();
				pstmt=conn.prepareStatement(sql);
				pstmt.executeUpdate();
				System.out.println("출금완료");
			}else{
				System.out.println("계좌가 존재하지 않습니다.");
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
			System.out.println("전체 출력 에러");
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
				System.out.println(account.getB_name()+"님의 잔액:"+account.getBalance());
			}
			
		}catch(Exception e){
			System.out.println("전체잔액 조회 에러");
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
			System.out.print("계좌번호를 입력하세요:");
			account.setId(scan.next());
			
			sql="Select id,balance from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				account.setBalance(rs.getLong("balance"));
			}
			
			System.out.println(account.getId()+"계좌의 잔액:"+account.getBalance());
			
		}catch(Exception e){
			System.out.println("계좌가 존재하지않습니다.");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}
