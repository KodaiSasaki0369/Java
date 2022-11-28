package Test;

public class Exec {
	
	public static void main(String[] args) {
		
		Denpyo denpyo1 = new Denpyo();
		
		denpyo1.data = "01-15";
		denpyo1.item = "パソコン";
		denpyo1.price = 50000;
		denpyo1.number = 1;
		
		Denpyo denpyo2 = new Denpyo();
		
		denpyo2.data = "01-16";
		denpyo2.item = "コピー用紙";
		denpyo2.price = 600;
		denpyo2.number = 5;
		
		denpyo1.disp();
		denpyo2.disp();
		
	}
	
}