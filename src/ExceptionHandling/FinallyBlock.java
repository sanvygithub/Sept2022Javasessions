package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("A");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		} finally {
			System.out.println("Hello");
		}

		int p = 10;
		int q = 20;
		System.out.println(p + q);

	}

}
