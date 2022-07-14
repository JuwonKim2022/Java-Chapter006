package sec08.ex01_methoddeclaration;

public class Computer {
	
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public int sum2(int ... values) {	//배열변
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}

}
