package Exercises14;

public class Exec2 {
	
	public static void main(String[] args) {
		
		Dice3 dice1 = new Dice3(6, "黒");
		Dice3 dice2 = new Dice3("赤");
		Dice3 dice3 = new Dice3();
		
		System.out.println("dice1 = " + dice1.val + "/" + dice1.color);
		System.out.println("dice2 = " + dice2.val + "/" + dice2.color);
		System.out.println("dice3 = " + dice3.val + "/" + dice3.color);		
		
	}

}
