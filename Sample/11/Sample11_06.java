package Sample11;

import lib.Input;

public class Sample11_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int data, total = 0;
		
		while ((data = Input.getInt()) != 0) {
			
			if(data < 0) {
				
				System.out.println("不正なデータ : " + data);
				
				continue;
			}
			
			total += data;
			
		}
		
		System.out.println("合計 = " + total);
		
	}

}