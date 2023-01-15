package BuilderPattern;

public class EcommApp {
	public String name;
	
	
	public EcommApp login(String username,String password) {
		System.out.println("name:"+ username+":"+"pwrd:"+password);
		String name="Sandhya";
		this.name=name;
		return this;
	}
	public EcommApp search(String Prodname) {
		System.out.println("name:"+ Prodname);
		return this;
	}
	public EcommApp Search(String Prodname,String color) {
		System.out.println("name:"+ Prodname+":"+"colour:"+color);
		return this;
	}
	public EcommApp addToCart(String Prodname) {
		System.out.println("name:"+Prodname);
		return this;
	}
	public EcommApp payment(String upi) {
		System.out.println("UPI"+1234);
		return this;
	}
	public EcommApp payment(String cc,String cvv) {
		System.out.println(cc+":"+cvv);
		return this;
	}
	public EcommApp getOrderid() {
		System.out.println("getOrderid");
		return this;
	}
	public EcommApp logout() {
		System.out.println("logout");
		return this;
	}
	
	
}
