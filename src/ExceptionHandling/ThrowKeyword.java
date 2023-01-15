package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("Launch browser");
		String data=null;
		if(data==null) {
			try {
				throw new Exception("Data Not Found Exception");
			}
			catch(Exception e) {
				System.out.println("Data not found exception is coming");
				e.printStackTrace();
			}
			
			System.out.println("logout");
		}
		System.out.println("Bye!");
		

	}

}
