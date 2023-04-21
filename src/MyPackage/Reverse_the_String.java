package MyPackage;

import java.util.Scanner;

public class Reverse_the_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word:");
		
		String s = sc.next();
		String Org_s = s;
		
		// Appraoch 1
		
		String rev =" ";
		 
		int len = s.length();
		 
		for(int i = len-1; i>=0;i--)             //iteration
		{
			rev = rev + s.charAt(i);
			
		}
		System.out.println("the Reverse of the String :"+ rev);
		
		if(Org_s.equals(rev)) {                 // condition
			System.out.println("The Given word is a Palindrom"+ rev);
		
		}

		else {
			System.out.println("The given word is not a Palindrom: "+ rev);
		}
		
		// Approach 2
		
		char[] a= s.toCharArray();
		int length = a.length;
		 
		for(int i=length-1; i<=0; i--) {
			
			rev= rev+ a[i];
		}
		
		// Approach 3 -- Using String Buffer Class
		StringBuffer revv;
		StringBuffer sb = new StringBuffer(s);
		revv= sb.reverse();
	}

}
