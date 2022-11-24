package Test;

public class test11_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] val = {10, -12, 5, -12, 12, 25};
		
		for (int value : val) {
		
			if (value < 0) {
				
				System.out.println("負の値です");
				
				continue;
				
			}
			System.out.println(Math.sqrt(value));
		
		}
	}

}
