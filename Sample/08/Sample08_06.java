package Sample08;

import lib.Input;

public class Sample08_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = Input.getInt();
		int n = a % 2 == 0 ? 100 : 0;
		System.out.println("n = " + n);
	}

}
