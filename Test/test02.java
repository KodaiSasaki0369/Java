package Test;

import lib.Input;

public class test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a, b, c;
		
		a = Input.getDouble();
		b = Input.getDouble();
		c = Input.getDouble();
		
		double d, sq, ans1, ans2;
		
		d = Math.pow(b, 2) - 4 * a * c;
		sq = Math.sqrt(d);
		ans1 = (-b + sq) / 2 * a;
		ans2 = (-b - sq) / 2 * a;
		
		System.out.println("解1 = " + ans1);
		System.out.println("解2 = " + ans2);
	}

}
