package ch14;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam01 {
	public static void main(String[] args) {
		//1�ܰ� ����̹� ����
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("����̹� �˻� ����");
		}catch(ClassNotFoundException e){
			System.out.println("����̹� �˻� ����");
			e.printStackTrace();
		}
		
		//����Ŭ ���� �ּ�,�Ƶ�,���
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr";
		String pwd="1234";
		
		//2�ܰ� ������ �����ϴ� ��ü ����
		try {
			DriverManager.getConnection(url,id,pwd);
//			System.out.println("���Ἲ��");
		} catch (SQLException e) {
			System.out.println("�������");
			e.printStackTrace();
		}
	}
}
