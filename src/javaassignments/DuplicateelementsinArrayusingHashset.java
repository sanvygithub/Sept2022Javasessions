package javaassignments;

import java.util.HashSet;

public class DuplicateelementsinArrayusingHashset {

	public static void main(String[] args) {
		String arr[] = { "java", "python", "java", "perl" };

		HashSet<String> langs = new HashSet();

		for (String e : arr) {

			if (langs.add(e) == false) {
				System.out.println("Duplicate element is " + e);
			}
		}
		System.out.println(langs);

	}

}
