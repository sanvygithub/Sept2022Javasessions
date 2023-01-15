package javasessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		//Post decrement
		int a=1;
		int b= a++;
		System.out.println(a);//2
		System.out.println(b);//1
		System.out.println(a++);//2
		
		int d=-98;
		int f=d++;
		System.out.println(d);//-97
		System.out.println(f);//-98
		
		//Post Decrement
		int i=4;
		int j=++i;
		System.out.println(i);//5
		System.out.println(j);//5
		System.out.println(++i);//6
		System.out.println(i++);//6
		
		int k=-21;
		int m=--k;
		System.out.println(k);//-22
		System.out.println(m);//=-22
		
		
		int c=3;
		System.out.println(c);
		System.out.println(c++);// here println value will print i.e 3
		System.out.println(c);// after increment the value is given to c
		System.out.println(100/100);
		System.out.println(0/100);
		
		

	}

}
