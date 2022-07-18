package sec13.ex03_fieldmethod_access.p2;

import sec13.ex03_fieldmethod_access.p1.A;

public class C {
	
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
//		a.method2();
//		a.method3();
	}
	

}
