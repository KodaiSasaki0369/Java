package Sample05;

public class Sample05_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String ss = "abAB日本語abAB";
		
		int len = ss.length();
		int pos = ss.indexOf('日');
		char ch = ss.charAt(4);
		String str = ss.toLowerCase();
		
		System.out.println("長さ = " + len);
		System.out.println(" '日' は " + pos + "番目");
		System.out.println("4番目の文字は " + ch);
		System.out.println(ss + " ⇒ " + str);
		
	}

}
