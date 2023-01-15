package ExceptionHandling;

public class TryCatchBlock {
	String name;
	
	
	public static void main(String[] args) {
		
		//TryCatchBlock c=new TryCatchBlock();
		//c=null;
		
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try {
			//c.name="Sanvy";
			int i=9/0;
			System.out.println(i);
		} 
		catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
			try {
			//int j =1/0;
			}
			catch (ArithmeticException e1) {
				System.out.println("AE is coming");
				e1.printStackTrace();
				System.out.println("byeeeee");
				}
			System.out.println("BYE!!");
			}
		catch (NullPointerException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
			}
		catch (Error e) {
			System.out.println("AE is coming");
			e.printStackTrace();
			}
		
		System.out.println("come out of this page");
		
		int a[]=new int[3];
		try {
		a[4]=10;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB IS COMING");
			e.printStackTrace();
		}
		System.out.println("Landing on Home page");
		
		
		
		
		
		
		
		
		
		
	}

}
