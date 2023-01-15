package ExceptionHandling;

public class StudentFinallyBlock {

	public static int getMarksInfo(String StudentName) {
		System.out.println("Marks:" + StudentName);

		if (StudentName.equalsIgnoreCase("Aman")) {
			return 65;
		} else if (StudentName.equalsIgnoreCase("Raj")) {
			return 90;
		} else if (StudentName.equalsIgnoreCase("Kishore")) {

			try {
				int i = 9 / 0;
				return 96;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				e.printStackTrace();
				return 99;

			} finally {
				System.out.println("Final Block");
				//return 100;
			}
			//return 101;

		} else {
			return -1;
		}

	}

	public static void main(String[] args) {
		int m1=getMarksInfo("kishore");
		System.out.println(m1);

	}

}
