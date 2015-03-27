package bankModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;
//MVC : Controller
public class AccountDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private String sql=null;
	
	public ArrayList<AccountDto> showData(){
		ArrayList<AccountDto> list=null;
		conn=ConnectionProvider.getConnection();
		
		try{
			sql="select * from bank order by num desc";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			list=new ArrayList<AccountDto>();
			AccountDto account=null;
			while(rs.next()){
				account=new AccountDto();
				account.setNumber(rs.getInt("num"));
				account.setId(rs.getString("id"));
				account.setName(rs.getString("b_name"));
				account.setBalance(rs.getLong("balance"));
				list.add(account);
			}
			
		}catch(Exception e){
			System.out.println("전체 데이터 출력에러");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
		return list;
	}
	
	public int makeAccount(AccountDto accountDto){
		conn=ConnectionProvider.getConnection();
		int value=0;  
		
		try{
			sql="insert into bank values(bank_num_seq.nextval,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, accountDto.getId());
			pstmt.setString(2, accountDto.getName());
			pstmt.setLong(3, accountDto.getBalance());
			value=pstmt.executeUpdate();  //value=0 안들어가고 value=1이면 정상적으로 들어감
		}catch(Exception e){
			System.out.println("계좌 생성 에러");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
		return value;
	}
	
	public AccountDto deposit(String id){
		AccountDto dto=null;
		conn=ConnectionProvider.getConnection();
		
		try{
			sql="select * from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				dto=new AccountDto();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("b_name"));
				dto.setBalance(rs.getLong("balance"));
			}
		}catch(SQLException e){
			System.out.println("입금 에러");
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		return dto;
	}
	
	public int deposit(String id,long balance,long money){
		int value=0;
		conn=ConnectionProvider.getConnection();

		try{
			sql="update bank set balance=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setLong(1, balance+money);
			pstmt.setString(2, id);
			value=pstmt.executeUpdate();
		}catch(Exception e){
			System.out.println("입금 에러2");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
		return value;
	}
	
	public int withdraw(String id,long balance,long money){
		int value=0;
		
		conn=ConnectionProvider.getConnection();
		try{
			sql="update bank set balance=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setLong(1,(balance-money));
			pstmt.setString(2,id);
			value=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("withdraw Error");
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		return value;
	}
	
	public int delete(String id){
		int value=0;
		conn=ConnectionProvider.getConnection();
		
		try{
			sql="delete from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			value=pstmt.executeUpdate();
		}catch(Exception e){
			System.out.println("delete error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
		return value;
	}
}
