package javasessions;

public class MethodOverloading {
	
	public void user() {
		System.out.println("User method");
	}
	public String user(String name) {
		System.out.println("user method:" + name);
		return name;
		
	}
	public int user(String name,int id) {
		System.out.println("user method:" + id);
		return id ;
	}
	public char user(char b) {
		System.out.println("user method:" + b);
		return b;
	}

	public static void main(String[] args) {
		MethodOverloading M=new MethodOverloading();
		//M.user();
		String a1=M.user("sandy");
		System.out.println(a1);
		int a2=M.user(a1, 101);
		System.out.println(a2);
		char c=M.user('$');
		System.out.println(c);
		
		

	}

}
