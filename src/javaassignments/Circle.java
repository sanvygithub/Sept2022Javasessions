package javaassignments;

public class Circle {
	
	
	public double circumference( double r ) {
		Double d=3.14;
		double cir=2*d*r;
		return cir;
	}
	public double area(double r) {
		double d1=3.14;
		double ar=d1*r*r;
		return ar;
	}

	public static void main(String[] args) {
		
		Circle c=new Circle();
		System.out.println(c.circumference(10));
		System.out.println(c.area(2));
		

	}

}
