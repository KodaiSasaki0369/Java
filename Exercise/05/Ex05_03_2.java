package Exercises05;

import lib.Input;

public class Ex05_03_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double x = Input.getDouble();
		double y = Input.getDouble();
		
		double a = Math.pow(x,  3) / Math.pow(y,  3);
		
		System.out.println("Math.pow(x, 3) ÷ Math.pow(y, 3) =  " + a);
	}

}
