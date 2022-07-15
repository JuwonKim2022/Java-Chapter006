package sec10.ex02_staticblock;

public class Tv {
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int fromInTo10Sum;
	
	static {
		info = company + " - " + model;
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		fromInTo10Sum = sum;
	}

}
