package javaassignments;

public class ForLoopAssignments {

	public static void main(String[] args) {
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
			System.out.println("-------------------------");
		}
		
		int k=1;
		do {
			System.out.println(k);
			k++;
			
			if(k==5) {
				break;
			}
			
		} while (true);

	}

}
