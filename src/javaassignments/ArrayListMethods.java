package javaassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> stnames = new ArrayList<String>(Arrays.asList("sanju", "surya", "Sanvy", "Kittu"));
		System.out.println(stnames.size());

		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("java", "perl", "C#", "Ruby", "java"));

		Object[] obj = lang.toArray();
		System.out.println(Arrays.toString(obj));

		ArrayList<String> cl = (ArrayList<String>) lang.clone();
		//System.out.println(cl);

		// stnames.addAll(lang);
		// System.out.println(stnames);

		stnames.addAll(2, lang);
		// System.out.println(stnames);

		// lang.retainAll(Collections.singleton("java"));
		// System.out.println(lang);

		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		num.removeIf(e -> e % 2 == 0);
		// System.out.println(num);

	}

}
