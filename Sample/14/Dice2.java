package Sample14;

public class Dice2 {
	
	int val;
	
	public Dice2(int val) {
		
		this.val = val;
		
	}
	
	public Dice2() {
		
		val = 1;
		
	}
	
	public void play() {
		
		val = (int)(Math.random() * 6) + 1;
		
	}
	

}
