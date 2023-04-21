package MyPackage;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,5,2,3,4};
		
		// Approach 1
		boolean status = Arrays.equals(a,b);
		
		if(status==true) {
			System.out.println("Arrays are equal");
						
		}
		else {
			
			System.out.println("Arrays are not equal");
		}
		
		// Approach 2
		
		boolean Statuss = true;
		
		if(a.length == b.length) {
			
			for(int i=0; i<a.length; i++) {
				
				if(a[i]!=b[i]) {
					status = false;
				}
			}
			
 		}else {
 			status = false;
 		}
		if(status == true) {
			
		}else {
			
			
		}
	}

}
