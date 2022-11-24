package Exercises10;

import lib.Input;

public class Ex10_03_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = Input.getInt();
		
		if (number == 124) {
			
			System.out.println("大当たり");
			
		} else if (number == 123 || number == 125) {
			
		   System.out.println("前後賞");
		   
		} else {
			
			System.out.println("無効");
			
		}
	}

}
