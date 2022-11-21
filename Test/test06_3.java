package Test;

public class test06_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name = {"田中", "青木", "松田", "斎藤", "鈴木"};
		int[] year = {22, 19, 24, 26, 18};
		double[] height = {175.5, 183.2, 170.5, 165.3, 185.0};
		
		for (int i = 0; i < 5; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(year[i] + "\t");
			System.out.println(height[i] + "\t");
		}
	}

}
