package Test;

import lib.Input;

public class test11_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int quantity = Input.getInt("商品の数量");
		String code = Input.getStr("商品コード");
		int price;
		
		switch (code) {
		
		case "a100":
		case "b100":
			
			price = 100;
			
			break;
			
		case "a110":
		case "b110":
		case "b120":
			
			price = 200;
			
			break;
			
		case "c100":
		case "c110":
			
			price = 300;
			
			break;
			
		case "d100":
			
			price = 400;
			
		default:
			
			price = 500;
			
		}
		
		System.out.println("合計金額 = " + quantity * price + "円");
		
	}

}
