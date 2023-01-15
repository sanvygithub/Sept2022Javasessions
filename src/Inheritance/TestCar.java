package Inheritance;

public class TestCar {
	// final keyword
	//1.constant values
	//2.if there is "final" keyword in the method then that method cannot be overrided.
	//3.to prevent inheritance

	public static void main(String[] args) {
		BMW b=new BMW();
		b.Start();//Overloading
		b.Stop();//overloading method
		b.refuel();//inherited method
		b.autoParking();//individual method
		b.engine();
		System.out.println("----------------");
		b.engineInfo();
		
		
		Car c1=new Car ();
		c1.Start();
		
		System.out.println("---------------------------");
		Car c2=new BMW();
		c2.Start();
		c2.Stop();
		c2.refuel();
		c2.engine();
		
	Vehicle v1 = new Car();
	v1.engine();
	v1.BigCar();
	
	//Car C4=(Car) new Vehicle();
	
		
		

	}

}
