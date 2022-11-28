package Test;

import lib.Input;

public class test12_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double height = Input.getInt();
		double width = Input.getInt();
		double depth = Input.getInt();
		double weight = Input.getDouble();
		
		int gaku = ryokin(height, width, depth, weight);
		
		if(isOk(height,width,depth)) {
        	
        	System.out.println("料金 = " + gaku);
			
		} else {
			
			System.out.println("サイズオーバー");
			
		}
		
	}

	public static boolean isOk(double height, double width, double depth) {
		
		return 180 <= height + width + depth;	
		
	}
	
	public static int ryokin(double height, double width, double depth, double weight) {
		
		double length = height + width + depth;
		
		int gaku;
		
		if (length <= 90) {
			
			if(weight <= 5) {
				
				gaku = 500;
				
			} else if (weight <= 10) {
				
				gaku = 1000;
				
			} else {
				
				gaku = 1500;
				
			}
			
		} else {
			
			if(weight <= 5) {
				
				gaku = 1000;
				
			} else if (weight <= 10) {
				
				gaku = 2000;
				
			} else {
				
				gaku = 3000;
				
			}
						
		}
		
		return gaku;
		
	}
}
