package javasessions;

public class MethodCalling {
	
	public void t1() {
		System.out.println("t1 method");
		t3();
	}
	public void t2() {
		System.out.println("t2 method");
		//t3();
	}
	public void t3() {
		System.out.println("t3 method");
		
		
	}
	

	public static void main(String[] args) {
		MethodCalling MC=new MethodCalling();
		MC.t1();
		

	}

}
