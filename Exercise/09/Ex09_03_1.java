package Exercises09;

import lib.Input;

public class Ex09_03_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int value, total = 0, kensu = 0;
		
		while ((value = Input.getInt()) != 0) {
			
			total += value;
			kensu ++;
		}
		
		System.out.println(total);
		System.out.println(kensu);
	}

}
