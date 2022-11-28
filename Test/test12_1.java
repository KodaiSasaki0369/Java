package Test;

import lib.Input;

public class test12_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double mile = Input.getDouble("mile");
		
		System.out.println(mile + "マイル = " + mileToKm(mile) + "キロ" );
		
	}

	public static double mileToKm(double mile) {
		
		return mile * 1.609344;
		
	}
}
