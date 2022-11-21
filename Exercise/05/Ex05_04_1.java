package Exercises05;

public class Ex05_04_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "http://localhost:8080/index.html";		
		String str2 = str1.replace("localhost", "k-webs.jp");
		String str3 = str2.substring(7,21);
		String str4 = str3.toUpperCase();
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
	}

}
