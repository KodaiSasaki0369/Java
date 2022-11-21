package Test;

import lib.Input;

public class test06_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("start");
		
		int m, n;
		
		for (int i = 0; i < 3; i++) {
			 m = Input.getInt();
			 n = Input.getInt();
			System.out.println(n % m);
		}
		
		System.out.println("end");
	}

}
