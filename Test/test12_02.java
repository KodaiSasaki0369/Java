package Test;

import lib.Input;

public class test12_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = Input.getStr("テストする文字列");
		
		String msg = isEmpty(str) ? "nullまたは空" : "nullでも空でもない";
		
		System.out.println(msg);
				
	}
	
	public static boolean isEmpty(String str) {
		
		return str == null || str.length() == 0;
	}

}
