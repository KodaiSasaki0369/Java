package Sample14;

public class Dice {

	int val;
	
	public Dice(int val) {
		
		this.val = val;
		
	}
	
	public void play() {
		
		val = (int)(Math.random() * 6) + 1;
		
	}
}
