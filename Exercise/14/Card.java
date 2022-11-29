package Exercises14;

public class Card {
	
	String suit;
	int number;
	
	public Card(String suit, int number) {
		
		this.suit = suit;
		this.number = number;
	}
	
	public String face() {
	
	return suit + "/" + number;
	
	}
	
}
