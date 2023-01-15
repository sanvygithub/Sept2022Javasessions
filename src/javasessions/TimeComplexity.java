package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		//Time Complexity ==> O(n)
		
		int i=10;//O(1)
		
		System.out.println(i);//O(1)
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			//1+n+n+n ==> 1+3n(Linear equation) ==> 3n ==> n ==> O(n)
		}
		for (int k=1;k<=100;k++) {
			for(int m=1;m<=10;m++) {
				System.out.println(m);
				//(1+n+n)(1+n+n+n) ==> (1+2n)(1+3n) ==> (1+2n+3n+6n^2) ==> (6n^2+5n+1) ==>(6n^2+5n)==>n(6n+5)=>6n^2 ==> n^2 ==> O(n^2)
			}
		}
		for(int a=1;a<=10;a++) {
			for(int b=1;b<=10;b++) {
				for(int c=1;c<=10;c++) {
					System.out.println("c");
					}
		//(1+n+n)(1+n+n)(1+n+n+n)=>(1+2n)(1+2n)(1+3n)=>(1+4n^2+4n)(1+3n)=>1+4n^2+4n+3n+12n^3+12n^2 => 12n^3+16n^2+7n+1 =>12n^3+16n^2+7n
			//	=>n(12n^2+16n+7)=> 12n^3+16n^2=>n^2(12n+16)=>12n^3=>n^3==>O(n^3)
			}
			
		}
		
	}

}
