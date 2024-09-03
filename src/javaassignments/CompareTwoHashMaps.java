package javaassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHashMaps {

	public static void main(String[] args) {

		HashMap<String, Integer> Map1 = new HashMap<String, Integer>();
		Map1.put("A", 1);
		Map1.put("C", 2);
		Map1.put("B", 3);

		HashMap<String, Integer> Map2 = new HashMap<String, Integer>();
		Map2.put("C", 1);
		Map2.put("B", 2);
		Map2.put("A", 3);

		HashMap<String, Integer> Map3 = new HashMap<String, Integer>();
		Map3.put("A", 3);
		Map3.put("B", 2);
		Map3.put("C", 1);
		Map3.put("D", 4);

		System.out.println(Map1.keySet().equals(Map3.keySet()));

		HashSet combkeys = new HashSet(Map3.keySet());
		combkeys.addAll(Map2.keySet());
		combkeys.removeAll(Map2.keySet());
		System.out.println(combkeys);

		System.out.println(new ArrayList<>(Map2.values()).equals(new ArrayList<>(Map1.values())));
		System.out.println(new HashSet<>(Map2.values()).equals(new HashSet<>(Map3.values())));

	}

}
