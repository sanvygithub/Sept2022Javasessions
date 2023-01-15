package javasessions;

public class TestOverloading {
	// E-Commerce application
	// login method
	// search
	// payment
	// uber booking
	// launch String Url

	// same method name
	// different parameters

	public void test() {
		System.out.println("test method");
	}

	public void test(String username) {
		System.out.println(username);

	}

	public void test(String username, String password) {
		System.out.println(username + password);

	}

	public void test(String password, String username, int otp) {
		System.out.println(password + " " + username + " " + otp);
	}

	public int test(int i, int j) {
		System.out.println("test method");
		int k = i + j;
		return k;
	}

	public static void main(String[] args) {
		TestOverloading t = new TestOverloading();
		t.test();
		t.test("Sanju");
		t.test("sanju", "Sanju@123");
		t.test("Sanju@12", null, 2336);
		int B1 = t.test(10, 20);
		System.out.println(B1);

	}
	public static void main(String args) {
		System.out.println();
		
	}

}
