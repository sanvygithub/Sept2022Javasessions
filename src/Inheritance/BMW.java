package Inheritance;
///Is a relationship
public class BMW extends Car{
	@Override
	public void Start() {
		System.out.println("Start Method----BMW");
	}
	@Override
	public void Stop() {
		System.out.println("Stop Method----BMW");
	}
	
	public void autoParking() {
		System.out.println("Auto parking----BMW");
	}
	//Has a relationship 
	public void engineInfo() {
		Engine e1=new Engine();
		e1.engine();
	}
	
	
	

}
