package StringConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsPracticeDemo {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>(Arrays.asList("abcd", "abef", "efab", "gabf"));

		for (String e : s) {
			if (e.startsWith("ab")) {
				System.out.println(e);

			}

		}

	}

}
