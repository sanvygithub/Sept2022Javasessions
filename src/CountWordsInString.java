import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {

		String s = "This is is my my world";
		String[] ch = s.split(" ");

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String e : ch) {
			if (hm.containsKey(e)) {
				hm.put(e, hm.get(e) + 1);
			} else {
				hm.put(e, 1);
			}
		}

		// System.out.println(hm);

		for (Map.Entry<String, Integer> es : hm.entrySet()) {
			if (es.getValue() > 1) {
				System.out.println(es.getKey() + ":" + es.getValue());
			}

		}

	}

}
