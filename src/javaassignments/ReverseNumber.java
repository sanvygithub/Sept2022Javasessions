package javaassignments;

public class ReverseNumber {

	public static void main(String[] args) {

//		int n = 2789;
//		int temp = n;
//		int Rev = 0;
//		 while(n>0) {
//			 Rev=Rev*10+n%10;
//			 n=n/10;
//		}
//		System.out.println(Rev);
//
//		if (temp == Rev) {
//			System.out.println("given num is palindrome");
//		}

		int a[] = { 1, 2, 30, 40, 5 };

		int highest = a[0];
		int secondHighest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > highest) {
				secondHighest = highest;
				highest = a[i];
			} else {
				if (a[i] > secondHighest) {
					secondHighest = a[i];
				}
			}
		}
		System.out.println(highest);
		System.out.println(secondHighest);

	}

}
