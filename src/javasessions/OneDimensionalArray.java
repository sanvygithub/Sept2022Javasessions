package javasessions;

import java.util.Arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[4]);
		// System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(a));
		for (int b = 0; b <= a.length - 1; b++) {
			System.out.println(a[b]);
		}
		System.out.println("--------------------------------------");
		int c = 0;
		while (c <= a.length - 1) {
			System.out.println(a[c]);
			c++;
		}
		System.out.println("----------------------------------------");
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.33;
		d[2] = 33.33;
		System.out.println(d[1]);
		System.out.println(Arrays.toString(d));
		for (int b = 0; b <= d.length - 1; b++) {
			System.out.println(d[b]);
		}
		System.out.println("For Each Loop");
		for (double d1 : d) {
			System.out.println(d1);
		}
		System.out.println("String array");

		String fam[] = new String[3];
		fam[0] = "Kishore";
		fam[1] = "Sandhya";
		fam[2] = "Happie";
		System.out.println(Arrays.toString(fam));
		for (String s : fam) {
			System.out.println(s);
		}
		System.out.println("------------------------------------");
		for (int g = 0; g <= fam.length - 1; g++) {
			if (fam[g].equals("Kishore"))
				System.out.println("Kishore is Manager");
			System.out.println(fam[g]);
		}
		System.out.println("-------------------------------------");
		int h[] = { 9, 8, 7, 6, 5 };
		System.out.println(h[0]);
		for(int x:h) {
			System.out.println(x);
			
		}
		System.out.println(Arrays.toString(h));

	}

}
