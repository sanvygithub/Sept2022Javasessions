package javaassignments;

public class PrimeNumber {

	public static void main(String[] args) {
		

		// prime number

		int num = 9;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Given number" + " " + "is a prime number");
			} else {
				System.out.println("not a prime numbernnnp'");

			}
		} else {
			System.out.println("please pass the correct number");
		}

	}

}
