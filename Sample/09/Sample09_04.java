package Sample09;

import lib.Input;

public class Sample09_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int value, total = 0;
		
		while((value = Input.getInt()) != 0) {
			
			total += value;
		}
		
		System.out.println("合計 = " + total);
	}

}
