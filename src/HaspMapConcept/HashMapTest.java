package HaspMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {

		// HashMap<String,String>map=new HashMap<String,String>();
		// Map<String,String>map=new HashMap<String,String>();
		Map<String, String> map = new LinkedHashMap<String, String>();
		// Map<String, String> map = new TreeMap<String, String>();
		map.put("Sandy", "Infosys");
		map.put("Kittu", "Google");
		map.put("Tom", "CTS");
		map.put("Peter", "Wipro");
		map.put("Aman", null);
		System.out.println(map.get("Kittu"));
		System.out.println(map);
		//System.out.println(map.size());
	}

}
