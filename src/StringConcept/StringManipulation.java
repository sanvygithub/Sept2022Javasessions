package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "This is my selenium";
		String t = "Hello java";
		String str = "hello hi this his my java code hello";
		
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(str.length());
		System.out.println(str.length() - 1);

		int len = str.length();
		int Li = 0;
		int Hi = str.length() - 1;
		System.out.println(len);
		System.out.println("Lowset index :" + Li);
		System.out.println("Highest index :" + Hi);

		System.out.println(str.charAt(0));
		// System.out.println(str.charAt(5));

		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('h', str.indexOf('h') + 1));
		System.out.println(str.indexOf('h', str.indexOf('h', str.indexOf('h') + 1) + 1));
		System.out.println(str.indexOf('h', str.indexOf('h', str.indexOf('h', str.indexOf('h') + 1) + 1) + 1));

		// System.out.println(str.indexOf("this"));
		// System.out.println(str.indexOf("javah"));

		String st = "Welcome Kishore";

		if (st.indexOf("kishore") != -1) {
			System.out.println("user name is present");

		} else {
			System.out.println("user name is not present");
		}

		String t1 = "java";
		String t2 = "java";
		System.out.println(t1 == t2);
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1.equals(t2));

		String t3 = new String("java");
		System.out.println(t2 == t3);
		System.out.println(t2.equals(t3));

		String p1 = "hi java";
		 p1=p1+" selenium";
		System.out.println(p1 + "java");

		String Str = "java-code-python-go";
		System.out.println(Str.replace("-", ","));

		String b1 = "hello Selenium";
		System.out.println(b1.contains("Selenium"));

		StringBuilder sb1 = new StringBuilder("Sandhya");
		StringBuilder sb2 = new StringBuilder("Sandhya");

//		sb1.append("Kishore");
//		System.out.println(sb1);

		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));

		String k1 = "Krishna";
		StringBuilder k2 = new StringBuilder(k1);
		k2.append(" Automation");
		System.out.println(k2);

		String w = "hi java  welcome Selenium Automation";
		String[] ar = w.split(" ");
		System.out.println(Arrays.toString(ar));

		// Revres a string
		// 1.using Built in functions
		String Test = "Selenium";
		StringBuilder sb3 = new StringBuilder(Test);
		StringBuilder sb4 = sb3.reverse();
		System.out.println(sb4);

		// 2.Without Built in functions

		int length = Test.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + Test.charAt(i);
		}
		System.out.println(rev);

		// SubString

		String mesg = "Your user username is sandhyakakarla";
		String Submesg = mesg.substring(22);
		System.out.println(Submesg);
		// System.out.println(mesg.charAt(16));

		String msg1 = mesg.substring(5, mesg.length());
		System.out.println(msg1);

		String s4 = mesg.substring(mesg.indexOf("user") + 5, mesg.indexOf("is"));
		System.out.println(s4);
		System.out.println(s4.length());

		String s5 = mesg.substring(mesg.indexOf("user") + 5);
		System.out.println(s5);

	}

}
