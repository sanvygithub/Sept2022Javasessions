package HaspMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EcommLogin {
	
	public static Double getProd(String Product) {
	Map<String,Double>map=new HashMap<String,Double>();
	map.put("DellLaptop", 12500.90);
	map.put("MacBook",13980.93);
	map.put("Hpprobook", 99999.99);
	map.put("Lenovo", 49500.00);
	
	return map.get(Product);
	}
	
	public static Double getName(String Product) {
		Double d1=getProd(Product);
		return d1;	
	}

	public static void main(String[] args) {
		
		Double d=getProd("MacBook");
		System.out.println(d);
		
		Double h1=getName("Lenovo");
		System.out.println(h1);
		
		
		
		
		

	}

}
