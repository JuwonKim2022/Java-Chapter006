package sec11.ex01_final;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person("12345-67890","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation="usa";
//		p1.ssn="14245-73434";
		p1.name="을지문덕";

	}

}
