package Sample12;

public class Sample12_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("*** BMIを計算 ***");
		
		double val = getBmi (1.75, 70.0);
		
		System.out.println("BMIは" + val + "です");
		System.out.println("*** END ***");
		
	}
	
	public static double getBmi (double height, double weight) {
		
		double bmi = weight / Math.pow(height, 2);
		
		return bmi;
	}

}
