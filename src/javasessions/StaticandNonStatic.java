package javasessions;

public class StaticandNonStatic {
	static int ID=10;
	String StudentName;
	static final String phn = "0123456789";
	


	public static void main(String[] args) {
		StaticandNonStatic st=new StaticandNonStatic();
		System.out.println(StaticandNonStatic.ID);
		System.out.println(ID);
		
		st.StudentName="Sandy";
		System.out.println(st.StudentName);
		System.out.println(StaticandNonStatic.phn);
		//static final String phn="12345678"; 
		
		
		

	}

}
