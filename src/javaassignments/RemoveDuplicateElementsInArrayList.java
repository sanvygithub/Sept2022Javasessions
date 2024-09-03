package javaassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInArrayList {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("java", "java", "perl", "c#"));
		LinkedHashSet<String> langs = new LinkedHashSet<String>(lang);
		ArrayList<String> UniqueLst = new ArrayList<String>(langs);
		System.out.println(UniqueLst);

		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 9));
		List<Integer> dist = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(dist);

	}

}
