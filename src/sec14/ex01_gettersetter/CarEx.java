package sec14.ex01_gettersetter;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-60);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
			
		}
		System.out.println("현재속도 : "+myCar.getSpeed());

	}

}
