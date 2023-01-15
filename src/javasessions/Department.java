package javasessions;

public class Department {
	static int deptID = 10;
	String name = "Kittu";
	static final String phn = "05679";

	public static void main(String[] args) {
		System.out.println(StaticandNonStatic.ID);//
		System.out.println(StaticandNonStatic.phn);
		System.out.println();

		// static String phn="05679";

		System.out.println(Department.deptID);
		Department d = new Department();
		// d.name="Kishore";
		System.out.println(d.name);
		// System.out.println(d.deptID);
		final int days = 7;
		//days = 10;
		System.out.println(days * 10);

	}

}
