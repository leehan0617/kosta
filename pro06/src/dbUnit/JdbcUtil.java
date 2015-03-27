package dbUnit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	public static void close(Connection conn){
		try{
			if(conn!=null)conn.close();		
		}catch(SQLException e){
			System.out.println("JdbcUtil Error(Connection)");
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt){
		try{
			if(pstmt!=null)pstmt.close();
		}catch(SQLException e){
			System.out.println("JdbcUtil Error(PreparedStatement)");
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs){
		try{
			if(rs!=null)rs.close();
		}catch(SQLException e){
			System.out.println("JdbcUtil Error(ResultSet)");
			e.printStackTrace();
		}
	}
}
