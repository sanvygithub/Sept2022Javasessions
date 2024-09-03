package javaassignments;

import java.util.Arrays;

public class AlphaNumericArray {

	public static void main(String[] args) {

//		String input = "A4B32C1";
//		StringBuilder letters = new StringBuilder();
//		StringBuilder numbers = new StringBuilder();
//		char[] ch = input.toCharArray();
//		System.out.println(ch);
//		for (char c : ch) {
//			if (Character.isLetter(c)) {
//				letters.append(c);
//			} else if (Character.isDigit(c)) {
//				numbers.append(c);
//			}
//		}
//
//		 System.out.println("Output: " + letters.toString() + numbers.toString());

		String input = "A4B32C1D7";
		StringBuilder Letters = new StringBuilder();
		StringBuilder Numbers = new StringBuilder();
		char[] ch = input.toCharArray();
		for (Character e : ch) {
			if (Character.isLetter(e)) {
				Letters.append(e);
			} else if (Character.isDigit(e)) {
				Numbers.append(e);
			}
		}
		char Num[] = Numbers.toString().toCharArray();
		java.util.Arrays.sort(Num);
		String sortednum = new String(Num);
		System.out.println("Output: " + Letters.toString() + sortednum);

	}

}
