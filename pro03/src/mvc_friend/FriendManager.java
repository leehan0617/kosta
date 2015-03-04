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
		System.out.println("1.ģ�� �߰�");
		System.out.println("2.ģ�� �˻�");
		System.out.println("3.ģ�� ����");
		System.out.println("4.ģ�� ����");
		System.out.println("5.ģ�� ��ü����");
		System.out.println("6.����");
		System.out.println("=====================================");
	}
	
	//ģ���߰�
	public void insert(){
		Friend friend=new Friend();
		
		System.out.print("�̸�:");
		friend.setName(scan.next());
		
		System.out.print("�ּ�:");
		friend.setAddress(scan.next());
		
		System.out.print("��ȭ��ȣ:");
		friend.setPhone(scan.next());
		
		list.add(friend);
	}
	
	//ģ��ã��
	public void search(){
		System.out.println("�˻��� ģ���̸�:");
		String name=scan.next();
		
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			if(f.getName().equals(name)){
				System.out.println(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone());
				return ;
			}
		}
		
		System.out.println("ģ���̸��� �������� �ʽ��ϴ�.");
	}
	
	//ģ������
	public void delete(){
		System.out.print("������ ģ���̸�:");
		String name=scan.next();
		
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			if(f.getName().equals(name)){
				list.remove(i);
				System.out.println("ģ������ �Ϸ�.");
				return;
			}
		}
	}
	
	//ģ�� ����
	public void update(){
		System.out.print("������ ģ���̸�:");
		String name=scan.next();
		
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			if(f.getName().equals(name)){
				System.out.println(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone());
				
				System.out.print("������ ��ȭ��ȣ:");
				f.setPhone(scan.next());
				System.out.print("���� �ּ�");
				f.setAddress(scan.next());
				
				list.set(i,f);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}
		}
	}
	
	//��ü����
	public static void titleDisp(){
		System.out.println("�̸�\t�ּ�\t��ȭ��ȣ");
	}
	public void disp(){
		for(int i=0;i<list.size();i++){
			Friend f=list.get(i);
			System.out.println(f.getName()+"\t"+f.getAddress()+"\t"+f.getPhone());
		}
	}
}
