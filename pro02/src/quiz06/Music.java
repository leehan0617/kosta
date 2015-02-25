package quiz06;

public class Music extends CDinfo {
	private String artist;
	private String[] song;
	
	public void setArtist(String artist){
		this.artist=artist;
	}
	
	public void setSong(String[] song){
		this.song=song;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String[] getSong(){
		return song;
	}
	
	public void disp(){
		System.out.println("관리자 번호:"+super.getManagerNum());
		System.out.println("가수:"+getArtist());
		for(int i=0;i<song.length;i++){
			System.out.println("힌트송["+(i+1)+"]:"+song[i]);
		}
	}
}
