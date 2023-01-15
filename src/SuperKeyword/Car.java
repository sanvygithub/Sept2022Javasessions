package SuperKeyword;

public class Car extends Vehicle {

	int maxSpeed = 100;

	public Car() {
		System.out.println("Car Default constructor");
	}

	public Car(int maxSpeed) {
		System.out.println("Car maxSpeed constructor");
	}

	public void racing() {
		System.out.println("car---racing");
		engine();
	}

	public void refuel() {
		System.out.println("car---refuel");
		

	}

	public static void test() {
		System.out.println("car test");
	}

	private void engine() {
		System.out.println("Car engine ");

	}
}
