package sec12.ex03_import.mycompany;

import sec12.ex03_import.hankook.SnowTire;
import sec12.ex03_import.hankook.Tire;
import sec12.ex03_import.hyundai.A;
import sec12.ex03_import.hyundai.Engine;
import sec12.ex03_import.kumho.BigWidthTire;

public class Car {

	Engine engine = new Engine();
	A a = new A();
	
	SnowTire tire1 = new SnowTire();
	
	BigWidthTire tire2 = new BigWidthTire();
	
	Tire tire3 = new Tire();
	sec12.ex03_import.kumho.Tire tire4 = new sec12.ex03_import.kumho.Tire();
	
}
