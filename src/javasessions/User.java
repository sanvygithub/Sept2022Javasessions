package javasessions;

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		User u1 = new User();
		u1.name = "Sandhya";
		u1.age = 25;
		u1.city = "AP";

		User u2 = new User();
		u2.name = "Kishore";
		u2.age = 25;
		u2.city = "vizag";

		User u3 = new User();
		u3.name = "Lucky";
		u3.age = 26;
		u3.city = "Banglore";

		User u4 = new User();
		u4.name = "Vastavi";
		u4.age = 25;
		u4.city = "AP";

		User u5 = new User();
		u5.name = "Vishnu";
		u5.age = 29;
		u5.city = "Gujarat";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		System.out.println(u5.name + " " + u5.age + " " + u5.city);
		System.out.println("--------------------------------------");

		u1 = u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);// kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// kishore
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// lucky
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// Vastavi
		System.out.println(u5.name + " " + u5.age + " " + u5.city);// Vishnu
		System.out.println("-----------------------------------------------------");
		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);// kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// lucky
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// lucky
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// vastavi
		System.out.println(u5.name + " " + u5.age + " " + u5.city);//vishnu
		System.out.println("-----------------------------------------------------");
		u3=u4;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// lucky
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// vastavi
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// vastavi
		System.out.println(u5.name + " " + u5.age + " " + u5.city);//vishnu
		
		System.out.println("-----------------------------------------------------");
		u4=u5;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// lucky
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// vastavi
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// Vishnu
		System.out.println(u5.name + " " + u5.age + " " + u5.city);//Vishnu
		
		System.out.println("-----------------------------------------------------");
		u5=u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// lucky
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// vastavi
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// vishnu
		System.out.println(u5.name + " " + u5.age + " " + u5.city);//Kishore
		
		System.out.println("-----------------------------------------------------");
		u4=u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// lucky
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// vastavi
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// Lucky
		System.out.println(u5.name + " " + u5.age + " " + u5.city);//kishore
		
		System.out.println("-----------------------------------------------------");
		u5=u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//kishore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// lucky
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// vastavi
		System.out.println(u4.name + " " + u4.age + " " + u4.city);// lucky
		System.out.println(u5.name + " " + u5.age + " " + u5.city);//lucky

	}

}
