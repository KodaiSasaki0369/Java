package Exercises12;

import lib.Input;

public class Ex12_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int tanka = Input.getInt("単価");
		double ritu = Input.getDouble("率");
		
		System.out.println("税額 = " + tax(tanka, ritu));
		
	}
	
	public static  int tax(int tanka, double ritu) {
		
		return (int)(tanka * ritu);
	}

}
