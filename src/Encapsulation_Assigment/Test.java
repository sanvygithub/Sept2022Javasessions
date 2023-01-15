package Encapsulation_Assigment;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String Plugin[] = new String[4];
		Plugin[0] = "Xpath";
		Plugin[1] = "Locator";
		Plugin[2] = "CSS";
		Plugin[3] = "sendkeys";
		
		String Plugin1[] = new String[4];
		Plugin1[0] = "Xpath1";
		Plugin1[1] = "Locator1";
		Plugin1[2] = "CSS1";
		Plugin1[3] = "sendkeys1";
		
		

		Browser br = new Browser("Chrome", 12.01, Plugin);
		System.out.println(Arrays.toString(br.getPlugin()));
		br.setPlugin(Plugin1);
		System.out.println(Arrays.toString(br.getPlugin()));
		System.out.println(br.getName());
		System.out.println(br.getVersion());
		br.setName("Edge");
		System.out.println(br.getName());
		
		

	}

}
