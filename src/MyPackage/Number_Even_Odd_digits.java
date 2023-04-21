package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_Even_Odd_digits {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		
		int EvenCount=0;
		int OddCount=0;
	
		ArrayList even = new ArrayList();
		ArrayList odd = new ArrayList();
		
		while(num>0)
		{
			int rem = num % 10;
				if(rem % 2 == 0)
				{
					even.add(rem);
					EvenCount ++;
				}
				else
				{
					odd.add(rem);
					OddCount++;
					
				}
				
				num = num /10;
		}
		System.out.println("The Even digits in number are:"+ even  + "the number of even number are:"+ EvenCount);
		System.out.println("The Even digits in number are:"+ odd + "the number of even number are:"+ OddCount);
	}

}
