package Sample11;

import lib.Input;

public class Sample11_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = Input.getString();
		
		switch (str) {
		
		case "おひつじ座":
		case "おうし座":
		case "ふたご座":
			
			System.out.println("春から夏 (3/21～6/21) ");
			
			break;
			
		case "かに座":
		case "しし座":
		case "おとめ座":
			
			System.out.println("夏から秋 (6/22～9/22) ");
		
			break;
			
		case "てんびん座":
		case "さそり座":
		case "いて座":
			
			System.out.println("冬から春 (12/22～3/20) ");
			
			break;
			
		default:
			
			System.out.println("冬から春 (12/22～3/20) ");
		
		}
		
	}

}
