package javaassignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsinString {

	public static void main(String[] args) {

		Dupcharacters("sandhya");
	}

	public static void Dupcharacters(String name) {

		char words[] = name.toCharArray();
		Map<Character, Integer> CharMap = new HashMap<Character, Integer>();
		for (Character ch : words) {
			if (CharMap.containsKey(ch)) {
				CharMap.put(ch, CharMap.get(ch) + 1);
				

			} else {
				CharMap.put(ch, 1);
				
			}
		}
		System.out.println(name + " : " + CharMap);
		System.out.println(CharMap.size());

//		Set<Map.Entry<Character, Integer>> entryset = CharMap.entrySet();
//		for (Map.Entry<Character, Integer> f : entryset) {
//			if (f.getValue() > 0) {
//				System.out.println(f.getKey() + " " + f.getValue());
//			}
//		}

	}

}
