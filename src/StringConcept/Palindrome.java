package StringConcept;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String s="MALAYALAM";
		//System.out.println(s.length()-1);
		
		String temp="";
		for (int i= s.length()-1 ;i>=0;i--){
			temp= temp + s.charAt(i);
			}
		if (temp.equals(s)) {
			System.out.println("Given word"+" "+s+" "+"is a palindrome");
		}
		else {
			System.out.println(" Given word"+" "+s+" "+"is not a palindrome");
		}
	
			
		

	}

}
