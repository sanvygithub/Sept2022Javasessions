package SuperKeyword;

public class BMW extends Car{
	int maxSpeed=200;
	
	public BMW () {
		super();
		System.out.println("BMW Default constructor");	
	}
	
	
	public void info() {
		System.out.println(super.maxSpeed);
		System.out.println(maxSpeed);
		test();
		super.test();
		super.refuel();
		
	}
	@Override
	public void racing() {
		super.racing();
		System.out.println("BMW---racing");
		
	}
	//Method Hiding
	public static void test() {
		System.out.println("BMW test");
	}
	
	
	public static void main(String[] args) {
		
		BMW B=new BMW();
		B.info();
		B.racing();
		B.refuel();
		
		
		
		
		
		
		

	}

}
