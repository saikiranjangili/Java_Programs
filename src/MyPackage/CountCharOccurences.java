package MyPackage;

import java.util.Scanner;
public class CountCharOccurences {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter the String :");
        String str = scn.nextLine();

        // String str = "Welcome to the Testing practice";

        System.out.println("The letter you want to count in String: ");
        String l = scn.nextLine();

        int totalLength = str.length();
        int totalcount_afterremoval=str.replace(l,"").length();

        int count = totalLength - totalcount_afterremoval;

        System.out.printf("Number of Occurance of the "+ l + " is:"+ count);

    }
}
