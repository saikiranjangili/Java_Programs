package MyPackage;

import java.util.Scanner;

public class Fabinocci_Series {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2);
		
		for (int i = 2; i<=num; i++)
		{
			sum = n1+n2;
			System.out.print("  "+ sum);
			n1=n2;
			n2= sum;
		}
				
	
		
		

	}

}
