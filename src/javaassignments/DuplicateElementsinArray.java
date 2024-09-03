package javaassignments;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String [] array= {"java", "C3#","java","perl","python","python" };
		boolean flag=false;
		 
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1; j<array.length;j++) {
				
				if(array[i]==array[j]) {
					
					System.out.println("Duplicate Element found :" + array[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false) {
			System.out.println("Duplicate element is not found");
			
		}
	}

}
