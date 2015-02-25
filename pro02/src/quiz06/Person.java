package quiz06;

public class Person {
	private String name="";
	private int kor=0;
	private int eng=0;
	private int mat=0;
	private int tot=0;
	private float avg=0.0f;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		tot=getKor()+getMat()+getEng();
		return tot;
	}
	
	public float getAvg() {
		avg=(float)getTot()/3;
		return avg;
	}
	
	public void setData(String name,int kor,int mat,int eng){
		setName(name);
		setKor(kor);
		setMat(mat);
		setEng(eng);
	}
}
