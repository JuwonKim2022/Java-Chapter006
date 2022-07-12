package sec06.ex02_fielddefaultvalue;

public class FieldInitValueEx {

	public static void main(String[] args) {
	
		FieldIntValue fiv = new FieldIntValue();
		
		System.out.println("byteFiled : "+fiv.byteField);
		System.out.println("shortField : "+fiv.shortField);
		System.out.println("intField : "+fiv.intField);
		System.out.println("longField : "+fiv.longField);
		
		System.out.println("booleanField : "+fiv.booleanField);
		System.out.println("charField : "+fiv.charField);	//유니코드 0이 들어가있어서 출력에서는 안 나타남
		
		System.out.println("floatField : "+fiv.floatField);
		System.out.println("doubleField : "+fiv.doubleField);
		System.out.println("arrayField : "+fiv.arrayField);
		System.out.println("referanceField : "+fiv.referenceField);

	}

}
