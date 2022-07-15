package sec09.ex01_instancemember;

public class Car {

	String model;
	int speed;
	
	Car(String model){
		this.model=model;
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);	//this붙이면 setSpeed의 것임을 확실히 함. 략 가
			System.out.println(this.model + "가 달립니다.(시속 : "+speed+"km/h)");	//this생략가능
		}
	}
}
