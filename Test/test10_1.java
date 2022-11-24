package Test;

import lib.Input;

public class test10_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String eword, jword;
		
		while ((eword = Input.getString()) != null) {
			
			if (eword.equals("dog")) {
				
				jword = "いぬ";
				
			} else if (eword.equals("cat")) {
				
				jword = "ねこ";
				
			} else if (eword.equals("mouse")) {
				
				jword = "ねずみ";
				
			} else if (eword.equals("rabbit")) {
				
				jword = "うさぎ";
				
			} else {
				
				jword = "?";
			}
					
			System.out.println(jword);
			
		}
	}

}
