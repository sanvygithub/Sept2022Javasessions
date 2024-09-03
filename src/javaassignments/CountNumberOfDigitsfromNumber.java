package javaassignments;

public class CountNumberOfDigitsfromNumber {

	public static void main(String[] args) {
		
		long num= 1234567679;
		int count=0;
		
		while(num>0) {
			
			num=num/10;
			
			count++;
			
		}
		System.out.println(count);
		

	}

}
