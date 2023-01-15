package BuilderPattern;

public class Employee extends Company {
	
	String name;
	int id;
	double salary;
	
	public Employee() {
		super();
	System.out.println("Employee const...");
	}
	

	public Employee(String name, int id, double salary) {
		//super(name,salary);
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	public static void main(String[] args) {
		Employee e=new Employee("sandy",121,12.99);
//		e.name="tom";
//		e.id=123;
//		e.salary=15.86;
		
		
		System.out.println(e.name+":"+e.id+":"+e.salary);
		
	}

}
