package Exercises14;

public class Dice3 {
	
	int val;
	String color;
	
	public Dice3(int val,String color) {
		
		this.val = val;
		this.color = color;
		
	}
	
	public Dice3(String color) {
		
		this(1,color);
		
	}
	
	public Dice3() {
		
		this(1, "白");
		
	}
	
	public void play() {
		
		val = (int)(Math.random() * 6) + 1;
	}

}
