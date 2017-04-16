package project_4;

class map{
	private int creature[];
	private boolean flag[];
	private int suitPieces[];
	
	public void setCreature(int c[]){
		this.creature = new int[9];
		for(int i = 0; i < 9; i++)
		{
			creature[i] = c[i];
		}
	}
	
	public void setFlag(){
		this.flag = new boolean [9];
		for(int i = 0; i < 9; i++)
		{
			flag[i] = true;
		}
	}
	
	public boolean[] getFlag(){
		return this.flag;
	}

	public void setPieces() {
		this.suitPieces = new int [4];
		for(int i = 0; i < 4; i++)
		{
			suitPieces[i] = i+1;
		}
	}
	
	
}

public class Busy {
	map[] m = new map[4];

}
