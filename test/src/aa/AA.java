package aa;

class BB{
	protected int x,y;
	
	public BB(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class CC extends BB{
	public int z;
	
	public CC(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
}

public class AA{
	
}