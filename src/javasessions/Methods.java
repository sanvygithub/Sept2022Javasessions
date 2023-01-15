package javasessions;

public class Methods {

	public void test() {
		System.out.println("Test Method");
	}

	public int add() {
		System.out.println("add method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public double bill() {
		System.out.println("total bill");
		int starters = 100;
		double drinks = 50.60;
		int maincourse = 200;
		double total = starters + drinks + maincourse;
		return total;
	}

	public int mul(int x, int y) {
		System.out.println("mul method");

		int d = x * y;
		return d;

	}

	public void click() {
		System.out.println("Click method");
	}
	public String sendkeys() {
	String Name="Naveen";
	return Name;
	}
	

	public static void main(String[] args) {
		Methods m = new Methods();
		m.test();
		int i = m.add();
		// System.out.println(m.add());// not as per standards
		System.out.println(i);
		int n = m.mul(10, 20);
		System.out.println(n);
		double j = m.bill();
		System.out.println(j);
		m.click();
		String p=m.sendkeys();
		if(p.equals("Naveen")) {
			System.out.println("India");
		}
		
	}

}
