package ch05;

class Su{
	public int x; // �ɹ�����,�ν��Ͻ�����
	public float y;
	public char z;	
}
public class Ex51 {
	public static void main(String[] args) {
		Su s=new Su(); //��ü
		s.x=10;
		s.y=55.5f;
		s.z='A';
		System.out.println(s.x+"\t"+s.y+"\t"+s.z);
		
		Su k=new Su();
		k.x=11;
		k.y=12.3f;
		k.z='Q';
		System.out.println(k.x+"\t"+k.y+"\t"+k.z);
		
		Su p=new Su();
		p.x=1;
		p.y=1.1f;
		p.z='P';
		System.out.println(p.x+"\t"+p.y+"\t"+p.z);
	}

}
