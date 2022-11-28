package Test;

public class test12_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] dt = {5, 7, 9, 14, 7, 4, 2};
		
		graph(dt);
		
		
	}
	
	public static void graph(int[] cnt) {
		
		for (int dots : cnt) {
			
			drow(dots);
			
		}
	}
	
	public static void drow(int dots) {
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print("#");
			
		}
		
		System.out.println();
	}

}
