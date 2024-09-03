
package javaassignments;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
//		String s = "Try Reverse String";
//		 String K = s.replace(" ", "");
//		// .out.println(K);
//		String temp = "";
//
//		for (int i = K.length() - 1; i >= 0; i--) {
//			temp = temp + K.charAt(i);
//
//		}
//		System.out.println(temp);
//
		String input = "Try Reverse String";
		String[] words = input.split(" ");
		StringBuilder output = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			output.append(reversedWord).append(" ");
		}

		System.out.println(output.toString().trim());

	}

}

