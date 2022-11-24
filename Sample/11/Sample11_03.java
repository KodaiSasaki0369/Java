package Sample11;

import lib.Input;

public class Sample11_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int value = Input.getInt();
		
		switch (value) {
		
		default:
			
			System.out.println("ラベルdefaultの処理です");
			
			break;
			
		case 10:
			
			System.out.println("ラベル10の処理");
			
			break;
			
		case 7:
			
			System.out.println("ラベル7の処理");
			
		}
		
		System.out.println("終了");
		
	}

}
