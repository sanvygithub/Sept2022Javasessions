package javaassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> CapitalMap = new HashMap<String, String>();
		CapitalMap.put("India", "Delhi");
		CapitalMap.put("Gujarat", "GandhiNagar");
		CapitalMap.put(null, "Dispur");
		CapitalMap.put("Assam", null);
		CapitalMap.put("Goa", "panaji");
		CapitalMap.put("sikkim", "Gangtok");

		System.out.println(CapitalMap.get("India"));
		CapitalMap.remove(null);
		// System.out.println(CapitalMap);

		Iterator<String> it = CapitalMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String Value = CapitalMap.get(key);
			System.out.println(key + ":" + Value);
		}
		System.out.println("***********************************");

		Iterator<Entry<String, String>> entry = CapitalMap.entrySet().iterator();
		while (entry.hasNext()) {
			Entry<String, String> pair = entry.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		CapitalMap.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
