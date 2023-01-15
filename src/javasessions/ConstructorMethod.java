package javasessions;

public class ConstructorMethod {
	String Name;
	int id;

	public ConstructorMethod(String Name, int id) {
		System.out.println("User method");
		this.Name = Name;
		this.id = id;
		// System.out.println(Name);
		// System.out.println(id);
	}

	public ConstructorMethod(String FirstName, String LastName, String Email, Long phn, String password,
			String confirmPassword) {
		System.out.println("Cust registration form");

	}

	public static void main(String[] args) {
		ConstructorMethod c = new ConstructorMethod("sandy", 7);
		System.out.println(c.id);
		System.out.println(c.Name);

	}

}
