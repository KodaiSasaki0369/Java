package Sample;

public class Sample04_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a, b;
		//前置
		a = 10;
		b = ++a + 5;              //aを1増やした後で a+5 を計算する
		System.out.println(a);
		System.out.println(b);
		//後置
		a = 10;
		b = a++ + 5;              //a+5 を計算した後でaえお1増やす
		System.out.println(a);
		System.out.println(b);
		
	}

}
