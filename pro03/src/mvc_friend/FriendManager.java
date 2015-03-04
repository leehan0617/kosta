package mvc_friend;

import java.util.ArrayList;
import java.util.Scanner;

//Contorller
public class FriendManager {
	private Scanner scan;
	private ArrayList<Friend> list;
	
	public FriendManager(){
		scan=new Scanner(System.in);
		list=new ArrayList<Friend>();
	}
	
	public void menu(){
		System.out.println("=================Menu================");
		System.out.println("1.친구 추가");
		System.out.println("2.친구 검색");
		System.out.println("3.친구 수정");
		System.out.println("4.친구 삭제");
		System.out.println("5.친구 전체보기");
		System.out.println("6.종료");
		System.out.println("=====================================");
	}
	
	//친구추가
	public void insert(){
		Friend friend=new Friend();
		
		System.out.print("이름:");
		friend.setName(scan.next());
		
		System.out.print("주소:");
		friend.setAddress(scan.next());
		
		System.out.print("전화번호:");
		friend.setPhone(scan.next());
		
		list.add(friend);
	}
	
	//친구찾기
	public void search(){
		System.out.println("검색할 친구이름:");
		String name=scan.next();
		
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			if(f.getName().equals(name)){
				System.out.println(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone());
				return ;
			}
		}
		
		System.out.println("친구이름이 존재하지 않습니다.");
	}
	
	//친구삭제
	public void delete(){
		System.out.print("삭제할 친구이름:");
		String name=scan.next();
		
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			if(f.getName().equals(name)){
				list.remove(i);
				System.out.println("친구삭제 완료.");
				return;
			}
		}
	}
	
	//친구 수정
	public void update(){
		System.out.print("수정할 친구이름:");
		String name=scan.next();
		
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			if(f.getName().equals(name)){
				System.out.println(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone());
				
				System.out.print("수정할 전화번호:");
				f.setPhone(scan.next());
				System.out.print("수정 주소");
				f.setAddress(scan.next());
				
				list.set(i,f);
				System.out.println("수정이 완료되었습니다.");
			}
		}
	}
	
	//전체보기
	public static void titleDisp(){
		System.out.println("이름\t주소\t전화번호");
	}
	public void disp(){
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			System.out.println(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone());
		}
	}
}
