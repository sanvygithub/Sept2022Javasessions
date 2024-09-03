package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		
		String h="java_python_ruby_selenium";
	
		String h1[]=h.split("_");
		
		System.out.println(h1[0]);
		//System.out.println(Arrays.toString(h1));
		
		for (int i=1;i<=h1.length-1;i++) {
			System.out.println(h1[i]);
		}
		
		//for(String x:h1) {
			//System.out.println(x);
			
		//}
		
		String test="Selenium";
		int k=test.indexOf('i');
		System.out.println(k);
		
		String s= "Selenium";
		
		String rev="";
		for(int u =s.length()-1;u>=0;u--) {
			 rev=rev + s.charAt(u);
			}
		System.out.println(rev);
		
		String msg="your id is kishore123 and pls login using given id";
		String cust=msg.substring(msg.indexOf("is")+3,msg.indexOf("and")-1);
		System.out.println(cust);
		System.out.println(cust.length());
		
		
		ArrayList<String>ar=new ArrayList<String>();
		ar.add("sandhya");
		ar.add("Kishore");
		ar.add("sanvy");
		System.out.println(ar.get(0));
		System.out.println(ar.size());
		
		ar.add("vastavi");
		System.out.println(ar.size());
		System.out.println(ar);
		
		String stdnames[]= {"Tom","Peter","jack","john"};
		System.out.println(Arrays.toString(stdnames));
		
		List<String>sc=Arrays.asList(stdnames);
		System.out.println(sc);
		
		
		
		
		
		
			}
	
	

}
