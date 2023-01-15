package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcommApp obj=new EcommApp();
		obj.login("Kishore@gmail.com", "Kishore123")
		.search("Hp probook")
			.Search("apple iphn", "silver")
				.addToCart("Mac book")
					.payment("kishore@axl")
						.payment("1234 5678 9029 7890", "021")
							.getOrderid()
								.logout();
		System.out.println("-------------");
		
		obj.login("Sandy@123gmail.com", "sanju123")
			.search("lenovo laptop")
				.logout();
		
		System.out.println("-------------");
		obj.search("Dell")
			.logout();
		
	}

}
