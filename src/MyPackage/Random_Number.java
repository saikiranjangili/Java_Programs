package MyPackage;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// Approach 1
		
		Random rand= new Random();
		int rand_int = rand.nextInt(10);
		
		
		// Appraoch 2
		System.out.println(Math.random());
		
		
		//Approach 3
		
		String randNum= RandomStringUtils.randomNumeric(5);
		String string = RandomStringUtils.randomAlphabetic(5);
	}

}
