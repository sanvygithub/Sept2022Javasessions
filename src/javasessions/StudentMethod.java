package javasessions;

public class StudentMethod {

	// AC: 0 - 100
	// WAF: pass the student name(String) as input parameter
	// return student marks (int)
	// else print a mesg -> student not found...return ?
	
	public int getMarks(String StudentName) {
		System.out.println("Get marks method");
		if(StudentName.contains("Sandhya")) {
			return 100;
		}
		else if(StudentName.equals("Kishore")){
			return 101;
			
		}
		else {
			System.out.println("Student name does not exists :"+StudentName);
			return -1;
		}
		
	}

	public static void main(String[] args) {
		StudentMethod st=new StudentMethod();
		int a=st.getMarks("Sandhya");
		System.out.println(a);
		if(a==100) {
			System.out.println("Eligible for scholarship:"+ a);
		}
		

	}

}
