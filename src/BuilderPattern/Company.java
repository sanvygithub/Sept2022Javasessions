package BuilderPattern;

public class Company {
	
	public Company() {
		System.out.println("company const...");
	}
	public Company(String name,double salary) {
		System.out.println("company const...");
		System.out.println(name+":"+salary);
	}

}
