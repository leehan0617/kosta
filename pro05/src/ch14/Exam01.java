package ch14;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam01 {
	public static void main(String[] args) {
		//1단계 드라이버 연결
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 검색 성공");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 검색 에러");
			e.printStackTrace();
		}
		
		//오라클 서버 주소,아디,비번
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr";
		String pwd="1234";
		
		//2단계 연결을 관리하는 객체 생성
		try {
			DriverManager.getConnection(url,id,pwd);
//			System.out.println("연결성공");
		} catch (SQLException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		}
	}
}
