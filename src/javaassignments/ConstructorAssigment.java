package javaassignments;

public class ConstructorAssigment {
	String FirstName;
	String LastName;
	String Email;
	String phn;
	String password;
	String ConfirmPassword;

	public ConstructorAssigment(String FirstName, String LastName, String Email, String phn, String password,String ConfirmPassword) {

		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.phn = phn;
		this.password = password;
		this.ConfirmPassword = ConfirmPassword;
		
	}
	public void user() {
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(phn);
		System.out.println(password);
		System.out.println(ConfirmPassword);
	}

	public static void main(String[] args) {
		ConstructorAssigment c = new ConstructorAssigment("Venkat","Kishore","venkat@gmail.com","984808","Kishore@143","Kishore@143");
		c.user();
		

	}

}
