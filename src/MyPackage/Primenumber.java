package MyPackage;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		int count=0;
		
		
		if(num>1)
		{
			for (int i=1; i<=num; i++)
			{
				if (num % i ==0) 
				{
					count ++;
					}
					if (count == 2)
					{
						System.out.println("the given number is Prime Number: ");
						break;
					}
					else 
					{
						System.out.println("the given number is not a Prime number: ");
					}
				}
				
			}
			
			
		
		else
		{
			System.out.println("the number is not a prime number");
		}
	}

}
