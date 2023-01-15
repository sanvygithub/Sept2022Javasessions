package Oops_Encapsulation;

public class User {
	
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("TOM");
		e1.setAge(24);
		e1.setSalary(15.33);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		Browser br=new Browser();
		br.launchBrowser();
		
		Customer c1=new Customer("Sandy",25,"sandy@gmail.com");
		System.out.println(c1.getName());
		System.out.println(c1.getId());
		System.out.println(c1.getEmail());
		c1.setName("kishore");
		c1.setId(25);
		c1.setEmail("Kishore@mail.com");
		System.out.println(c1.getName());
		System.out.println(c1.getId());
		System.out.println(c1.getEmail());
		

	}
	

}
