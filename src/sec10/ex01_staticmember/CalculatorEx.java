package sec10.ex01_staticmember;

public class CalculatorEx {

	public static void main(String[] args) {
		
		double result1 = 10*10*Calculator.pi;
		double result2 = 10*10*Math.PI;
		
		int result3 = Calculator.plus(10, 5);
		int result4 = Calculator.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		
	}

}
