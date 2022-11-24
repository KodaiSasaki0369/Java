package Test;

import lib.Input;

public class test09_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name;
		
		while ((name = Input.getString()) != null) {
			
			System.out.println("<" + name.length() + ">" + name);
		}
	}

}
