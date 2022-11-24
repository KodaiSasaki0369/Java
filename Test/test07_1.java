package Test;

public class test07_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double s[] = {12.3, 13.5, 11.5, 13.0, 12.8, 12.5};
		double total = 0;
		
		for (double n : s) {
			total += n;
		}
		
		System.out.println("合計 = " + total);
		System.out.println("平均 = " + total / s.length);
		
		for (double n : s) {
			System.out.print(n + "\t");
		}
	}

}
