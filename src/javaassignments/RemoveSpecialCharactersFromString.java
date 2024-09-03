package javaassignments;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		String S = "##@@$^% Selenium automation";

		String s1 = S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

		

	}

}
