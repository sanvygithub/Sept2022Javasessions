package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		//Data types
		//primitive data types (no need to create objects)
		 //Numeric Type:
			//Integral Type:
				//Integer: byte ,short,int,long
				//Floating point:Float,double
		    //Character Type:
				//char:'@','b'
		
		//1.byte:
		//range:-128 to 127
		//size:1 byte= 8 bits
		byte a=10;
		byte b=10;
		byte e=0;
		byte h=-7;
		System.out.println(a+10);
		System.out.println(b);
		System.out.println(e);
		System.out.println(h);
		int c=a+b;
		System.out.println(c);
		
		//2.Short:
		//range:-32767 to 32768
		//size: 2 bytes=16 bits
		
		short s1=700;
		short s2=4000;
		int s3=s1+s2;
		System.out.println(s3);
		
		//3.int:
		//range:-2147483648 to 2147483647
		//size: 4bytes=32 bits
		
		int z=56789;
		int y=6789908;
		System.out.println(y);
		int w=y+z;
		System.out.println(w);
		 
		//4.long:
		//range:- 2^63
		//Size:8 bytes=64 bits
		long l1=5678900018L;//ex:world Population,Distance between earth and sun
		System.out.println(l1);
		
		//5.float:
		//range:upto 7 decimal digits
		//size:4 bytes=32 bits(same as int)
		
		float f1=12.33f;
		float f2=(float)35.22;
		float f3=100;
		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f2);
		
		//double:
		//range:upto 15 decimal digits
		//Size: 8 bytes=64 bits (same as long)
		
		double d1=12.9988688; //rating,price,BMI,pi value
		double d2=34.789900;
		System.out.println(d1);
		System.out.println(d2);
		
		// Char
		//range:
		//a-z= 97 to 122
		//A-Z= 65 to 90
		//0-9= 48-57
		//size: 2bytes=16 bits
		
		char c1='a';//97 ASCII value
		char c2='$';
		char c3='1';
		System.out.println(c1);
		System.out.println(c1+10);
		System.out.println((int)c1); //Programmatically printing the ASCII value of variable c1 ie a
		System.out.println((byte)'b');
		System.out.println(c2);
		System.out.println(c3);
				
		//Boolean data type- true,false
		//size is around 1 bit approximately
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1);
		boolean myPasswordIsActive=true;
		boolean isPermananent=false;
		System.out.println(myPasswordIsActive);
		System.out.println(isPermananent);
		System.out.println(b2);
		
		
		
		
		
		
		//Non Primitive data type: class,array,interface,abs class
		
		
		
		
		
		
		
		
	}

}
