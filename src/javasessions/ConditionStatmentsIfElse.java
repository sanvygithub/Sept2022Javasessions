package javasessions;

public class ConditionStatmentsIfElse {

	public static void main(String[] args) {

		int a = 10;
		int b = 100;

		if (a == b) {
			System.out.println(true);
		} 
		else {
			System.out.println(false);
		}
System.out.println("----------------");
		int Marks=100;
		if(Marks>=99) {
			if(Marks>=100) {
				System.out.println("Grade A");
				if(Marks>=100) {
					System.out.println("Eligible for scholarship");
				}
				else {
					System.out.println("Not Eligible for scholarship");
					}
			
			}
			else {
				System.out.println("Grade is B");
			}
				
		}
		else {
			System.out.println("you needs to improve");
		}
System.out.println("------------------");
//we should not write code as it is checking every line ,it is not good code
		 String browser ="Chrome";
		 if(browser.equals("Chrome")) {
			 System.out.println("Lauch chrome");
			 }
		 if (browser.equals("IE")) {
			 System.out.println("Launch IE");
		 }
		 if (browser.equals("opera")) {
			 System.out.println("Launch opera");
		 }
		 else {
			 System.out.println("No browser found");
		 }
System.out.println("-------------------------------------------------");
		 String br = "chrome";
			if(br.equals("chrome")) {
				System.out.println("launch chrome");
			}
			else if(br.equals("firefox")) {
				System.out.println("launch firefox");
			}
			else if(br.equals("edge")) {
				System.out.println("launch edge");
			}
			else if(br.equals("ie")) {
				System.out.println("launch ie");
			}
			else {
				System.out.println("please pass the right browser...." + br);
			}
		 
	}

}
