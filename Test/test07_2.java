package Test;

public class test07_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name[] = {"田中", "中村", "鈴木", "山本", "本田"};
		double kokugo[] = {82, 85, 74, 90, 70};
		double eigo[] = {70, 74, 88, 74, 82};
		double totalKokugo = 0;
		double totalEigo = 0;
		double total = 0;
		
		for (double k : kokugo) {
			totalKokugo += k;
		}
		
		System.out.println("国語平均 = " + totalKokugo / kokugo.length);
		
		for (double e : eigo) {
			totalEigo += e;
		}
		
		System.out.println("英語平均 = " + totalEigo / eigo.length);
		
		System.out.println("科目平均 = " + (totalKokugo + totalEigo) / (kokugo.length + eigo.length));
		
		for (int i = 0; i < name.length; i++) {
			
			System.out.println(name[i] + " : " + (kokugo[i] + eigo[i]) / 2);
		}
	}

}
