package MyPackage;

public class Sum_of_digits {
	public static void main(String[] args) {
		
		int num =123456;
		int sum=0;
		while(num>0) {
			
			sum = sum + num%10;
			num = num/10;
			
		}
		
	}
}
