package quiz14_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner scan=null;
		boolean check=true;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			System.out.println("Driver Error");
			e.printStackTrace();
		}
		
		try{
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pwd="tiger";
			
			conn=DriverManager.getConnection(url, id, pwd);
		}catch(SQLException e){
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		while(check){
			System.out.print("입력하세요.(1.성적입력 2.성적출력 3.반평균&일등&꼴지 4.종료):");
			scan=new Scanner(System.in);
			int input=scan.nextInt();
			
			switch(input){
			case 1:
				try{
					System.out.print("번호:");
					int no=scan.nextInt();
					System.out.print("이름:");
					String name=scan.next();
					System.out.print("국어");
					int kor=scan.nextInt();
					System.out.print("영어");
					int eng=scan.nextInt();
					System.out.print("수학");
					int mat=scan.nextInt();
					String sql="insert into score values(?,?,?,?,?,?,?)";
					pstmt=conn.prepareStatement(sql);
					
					pstmt.setInt(1, no);
					pstmt.setString(2, name);
					pstmt.setInt(3, kor);
					pstmt.setInt(4, eng);
					pstmt.setInt(5, mat);
					pstmt.setInt(6, kor+eng+mat);
					pstmt.setFloat(7, (kor+eng+mat)/3.0f);
					pstmt.executeUpdate();
					System.out.println("입력 완료");
					break;
				}catch(SQLException e){
					System.out.println("입력 에러");
					e.printStackTrace();
				}
			case 2:
				try{
					String sql="select * from score order by no";
					pstmt=conn.prepareStatement(sql);
					rs=pstmt.executeQuery();
					
					while(rs.next()){
						int no=rs.getInt("no");
						String name=rs.getString("name");
						int kor=rs.getInt("kor");
						int eng=rs.getInt("eng");
						int mat=rs.getInt("mat");
						int tot=rs.getInt("tot");
						float avg=rs.getFloat("avg");
						System.out.println(no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
					}
				}catch(SQLException e){
					System.out.println("Select문 에러");
					e.printStackTrace();
				}
				break;
			case 3:
				try{
					String sql="select round(avg(avg),1),max(avg),min(avg) from score";
					pstmt=conn.prepareStatement(sql);
					rs=pstmt.executeQuery();
					
					if(rs.next()){
						float avg=rs.getFloat(1);
						int max=rs.getInt(2);
						int min=rs.getInt(3);
						System.out.println("평균:"+avg);
						System.out.println("1등:"+max);
						System.out.println("꼴지:"+min);
					}
				}catch(SQLException e){
					System.out.println("반평균 에러");
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("종료합니다.");
				check=false;
				try{
					
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					try{
						if(scan!=null)scan.close();
						if(conn!=null)conn.close();
						if(pstmt!=null)pstmt.close();
						if(rs!=null)rs.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				break;
			default: 
				System.out.println("존재하지 않는 버튼입니다.");
				break;
			}
		}
	}
}
