package MyPackage;

import java.util.Scanner;

public class reverse_the_number {

	public static void main(String[] args) {


	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");

	int num = sc.nextInt();
	int Org_num = num;
	
	// Approach 1
	
	int rev = 0;
	
	while (num!=0)
	{ 
		rev = rev*10 + num%10;       // 4  40+3=43   430+2=432  4320+1=4321 
		num = num/10;             //123  12    1  0
	} 
	System.out.println("The Reverse number:"+ rev);
	
	if (Org_num==rev)
	{
		System.out.println("The Number is  a palindrome");
	
	}
	
	else {
		System.out.println("The Number is not a palindrome ");
	}
	
    
	// Approach 2
	
	/*
	StringBuffer rev;
	StringBuffer  sb = new StringBuffer(String.valueOf(num));
	rev=sb.reverse();
	System.out.println("The Number after reverse:"+rev);*/
	
	
	
	// Approach 3
	
	/*StringBuilder rev;
	StringBuilder sd = new StringBuilder();
	rev = sd.reverse();  */
	
	
	
	}

}
