package MyPackage;

import java.util.Scanner;

public class Largest_Number {
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a= sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int c=sc.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("a is the largest" + a);
				
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest" + b);
		}
		else {
			System.out.println("b is the largest" + b);
		}
		
		// Approach 2  -- Ternary operator
		 int largest1 = a>b?a:b;
		int  largest2 = c>largest1? largest1:c;
			
		
	}
	

}
