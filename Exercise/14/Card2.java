package Exercises14;

public class Card2 {
	
	String suit;
	int number;
	
	public Card2 (String suit, int number) {
		
		this.suit = suit;
		this.number = number;
				
	}
	
	public Card2(String suit) {
		
		this(suit, 1);
		
	}
	
	public Card2(int number) {
		
		this("スペード", number);
		
	}
	
	public Card2() {
		
	}
	
	public String face() {
		
		return suit + "/" + number;
	}

}
