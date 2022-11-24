package Sample11;

import lib.Input;

public class Sample11_08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		exit: for (int i = 0; i < 2; i++) {
			
			int data,total = 0;
			
			while ((data = Input.getInt("データ")) != 0) {
				
				if (data < 0) {
					
					System.out.println("不正なデータ : " + data);
					break exit;
					
				}
				
				total += data;
			}
		}
		
		System.out.println("END");
	}

}
