
public class SearchPage1 {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5 };
		int highest = a[0];
		int secondHighest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > highest) {
				secondHighest = highest;
				highest = a[i];
			} 
			else {
				if (a[i] > secondHighest) {
					secondHighest = a[i];
				}
			}
			System.out.println(highest);
			System.out.println(secondHighest);
		}

	}

}
