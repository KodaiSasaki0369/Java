package Test;

import lib.Input;

public class test10_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dist, postage;
		dist = Input.getInt();
		
		if (dist < 50) {
			
			postage = 300;
			
		} else if (dist <100) {
			
			postage = 500;
			
		} else if (dist <500) {
			
			postage = 700;
			
		} else {
			
			postage = 1000;
			
		}
		
		System.out.println("料金 = " + postage);
		
	}

}
