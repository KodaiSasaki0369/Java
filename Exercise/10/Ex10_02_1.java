package Exercises10;

import lib.Input;

public class Ex10_02_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int nin = Input.getInt();
		int ryokin = nin * 850;
		
		if (nin >= 5) {
			
			System.out.println("入館料 = " + ryokin * 0.7);
		
		} else {
			
			System.out.println("入館料 = " + ryokin);
		}
		
		
	}

}
