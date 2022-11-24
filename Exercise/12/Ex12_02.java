package Exercises12;

public class Ex12_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		greet("田中宏",1);
		
	}
	
	public static void greet(String name, int sex) {
		
		if (sex == 1) {
			
			System.out.println("こんにちは" + name + "くん");
			
		} else {
			
			System.out.println("こんいちは" + name + "さん");
			
		}
		
	}

}
