package BuilderPattern;

public class Browser {
	String name;
	int id;
	double sal;
	
	public void getBrowser(Browser br1) {
		System.out.println("getBrowser method");
		br1.name="Firefox";
		br1.id=109;
		br1.sal=25.44;
	}

	public static void main(String[] args) {
		Browser br=new Browser();
		br.name="chrome";
		br.id=101;
		br.sal=22.44;
		System.out.println(br.name);
		System.out.println(br.id);
		System.out.println(br.sal);
		
		br.getBrowser(br);
//		br.name="safari";
//		br.id=102;
//		br.sal=23.44;
		
		System.out.println(br.name);
		System.out.println(br.id);
		System.out.println(br.sal);

	}

}
