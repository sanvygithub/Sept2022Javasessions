package javasessions;

public class Employee {

	String name;
	int age;
	double sal;
	boolean isPerm;

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Sandy";
		e.age = 25;
		e.sal = 12.50;
		e.isPerm = true;

		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.sal);
		System.out.println(e.isPerm);

		Employee e1 = new Employee();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.sal);
		System.out.println(e1.isPerm);

		new Employee();// no ref
		new Employee().name = "Kishore";

		Employee e2 = new Employee();// null reference variable
		e2 = null;
		// System.out.println(e2.name);//Null pointer Exception
		System.out.println(e2);
		System.out.println("-------------------------------------");

		Employee e4 = null;// object as null
		//System.out.println(e4.name);
		System.out.println(e4);

	}

}
