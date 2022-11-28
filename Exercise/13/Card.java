package Exercises13;

public class Card {
	
	String suit;
	
	int number;
	
	public void disp() {
		
		System.out.println("種類 = " + suit);
		System.out.println("番号 = " + number);
		
	}
	
	public static void main(String[] args) {
		
		Card card = new Card();

		card.suit = "スペード";
		
		card.number = 1;
		
		card.disp();
		
	}
}
