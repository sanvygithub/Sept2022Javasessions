package javaassignments;

import java.util.Comparator;
import java.util.stream.Collectors;

public class SortString {

	public static void main(String[] args) {

//		String s = "DBacCAbd";
//		char[] ch = s.toCharArray();
		// java.util.Arrays.sort(ch);
		// Arrays.sort(ch);
		// String sorted = new String(ch);
		// System.out.println(sorted);

		String input = "ABCDabcd";

		// String output = input.chars().mapToObj(c ->
		// (char)c).sorted(Comparator.comparingInt(Character::toLowerCase)).map(String::valueOf).collect(Collectors.joining());
		// System.out.println(output);

		String otp = input.chars().mapToObj(c -> (char) c).sorted(Comparator.comparingInt(Character::toLowerCase))
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println(otp);
	}

}
