package ch09;

public class Exam99 {
	public static void main(String[] args) {
		String url="Http://www.kma.go.kr/test/test.jsp";
		
		System.out.println("���ڿ� ���:"+url.substring(25));
		System.out.println("���ڿ� ���:"+url.substring(2,5));
		System.out.println("���ڿ� ���:"+url.indexOf(':'));
		System.out.println("���ڿ� ġȯ:"+url.replace("Http://www.kma.go.kr/test/test.jsp","Web Address"));
		System.out.println("url:"+url+"\n");
		
		System.out.println("�빮�����:" + url.toUpperCase());
		System.out.println("�ҹ������:" + url.toLowerCase());
		System.out.println("url:"+url+"\n");
		
		if(url.startsWith("Http:"))
			System.out.println("���ڿ� ���� �˻�");
		
		if(url.endsWith("jsp"))
			System.out.println("���ڿ��� �� �˻��մϴ�." + "\n");
		
		String str="�ڹ����α׷���";
		System.out.println(str.concat("�Թ�"));
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}
}
