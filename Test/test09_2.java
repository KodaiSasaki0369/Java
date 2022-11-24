package Test;

import lib.Input;

public class test09_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double number = 0, total = 0,  even = 0;
		int kensu = 0;
		
		while ((number = Input.getDouble()) != 0) {
						
		    total += number;
			kensu ++;
			
			System.out.println("合計 = " + total);
			System.out.println("件数 = " + kensu);
			System.out.println("平均 = " + total / kensu);
		}		
	}

}
