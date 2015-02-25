package quiz06;

public class Quiz02 {
	public static void main(String[] args){
		Music m=new Music();
		m.setManagerNum(123456);
		m.setArtist("플라이 투 더 스카이");
		String[] song={"너를너를너를", "전화하지 말아요"};
		m.setSong(song);		
		m.disp();
	}
}
