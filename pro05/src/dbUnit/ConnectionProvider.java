package dbUnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection getConnection(){
		Connection conn=null;
		
		try{
			String url="jdbc:oracle:thin:@192.168.7.208:1521:xe";
			String id="java";
			String pwd="tiger";
			conn=DriverManager.getConnection(url,id,pwd);
		}catch(SQLException e){
			System.out.println("ConnectionProvider getConnection() Error");
			e.printStackTrace();
		}
		
		return conn;
	}
}
