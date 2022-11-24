package Sample10;

import lib.Input;

public class Sample10_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double val = Input.getDouble();
		
		if (val < 0) {
			
			val = -1 * val;
		}
		
		System.out.println(val + "の平方根 = " + Math.sqrt(val));
	}

}
