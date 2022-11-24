package Test;

import lib.Input;

public class test10_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int month;
		String season;
		
		while ((month = Input.getInt("月")) != 0) {
			
			if (month == 12  || month <= 2) {
				
				season = "冬";
				
			} else if (5 >= month) {
				
				season = "春";
				
			} else if (8 >= month) {
				
				season = "夏";
				
			} else if (11 >= month) {
				
				season = "秋";
				
			} else {
				
				season = "?";
				
			}
			
			System.out.println("季節 = "+ season);
			
		}
	}

}
