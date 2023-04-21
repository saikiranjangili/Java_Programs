package MyPackage;

public class Swapping_Numbers {

	public static void main(String[] args) {
		
		// Approach1
		
		int a =10;
		int b =20;
		
		int t= a;
		a=b;
		b=t;
		
		// Approach 2
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		//Approach 3
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		// Approach 4 Logic operator Bit Wise
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		// approach 5 -- Single Statement
		
		b=a+b-(a=b);

	}

}
