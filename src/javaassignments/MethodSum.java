package javaassignments;

public class MethodSum {
	
	public int sum() {
		System.out.println("Sum Method");
		int a=10;
		int b=10;
		int c=a+b;
		return c;
	}
	public int product(int x,int y) {
		System.out.println("product method");
		int product=x*y;
		return product;
		}

	
		
	
	

	public static void main(String[] args) {
		MethodSum s=new MethodSum();
		int d=s.sum();
		System.out.println(d);
		 int P=s.product(50, 1000);
		 System.out.println(P);
		 
		
		

	}

}
