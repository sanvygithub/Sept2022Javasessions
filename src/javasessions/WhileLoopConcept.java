package javasessions;

public class WhileLoopConcept {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-------------------------------");
		short s = 10;
		while (s > 0) {
			System.out.println(s);
			s--;
		}
		System.out.println("----------------");
		double d = 1.1;
		while (d <= 10.1) {
			System.out.println(d);
			d++;
		}

		int p = 1;
		while (p <= 10) {
			System.out.println(p);
			p++;
			if (p == 5) {
				System.out.println("Value of p is 5");
				
				

			}
		}

	}
}
