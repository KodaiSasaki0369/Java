package Exercises10;

import lib.Input;

public class Ex10_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int weight = Input.getInt();
		int postage = 0;
		
	
			
		if (weight < 10) {
			
			postage = 800;
			
		} else if (weight < 5) {
			
			postage = 500;
			
		} else if (weight < 1) {
			
			postage = 300;
		
		} else {
			
			postage = 1500;
		}
		
		System.out.println("料金 = " + postage);
	}

}
