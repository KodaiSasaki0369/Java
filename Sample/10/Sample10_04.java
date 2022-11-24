package Sample10;

import lib.Input;

public class Sample10_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int score = Input.getInt();
		String grade;
		
		if (score >= 90) {
			
			grade = "AA";
			
		} else if (score >= 80) {
			
			grade = "A";
			
		} else if (score >= 70) {
			
			grade = "B";
			
		} else if (score >= 60) {
			
			grade = "C";
			
		} else {
			
			grade = "D";
			
		}
		
		System.out.println("成績は" + grade + "です");
	}

}
