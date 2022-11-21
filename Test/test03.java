package Test;

import lib.Input;

public class test03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a, b, c;
		
		a = Input.getDouble();
		b = Input.getDouble();
		c = Input.getDouble();
		
		double x = Math.pow(a, 2);
		double y = Math.pow(b, 2);
		double z = -2 * c;
		
		double h = Math.sqrt(a);
		double i = Math.sqrt(b);
		double j = 3 * c;
		
		System.out.println("(1) = " + (x + y - z));
		System.out.println("(2) = " + (h + i + j));

	}

}
