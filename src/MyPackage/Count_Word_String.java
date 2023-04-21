package MyPackage;

import java.util.Scanner;
public class Count_Word_String {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();

        int count =1;
        for(int i =0; i< str.length()-1;i++)
        {
            if((str.charAt(i)==' ' ) && (str.charAt(i+1)!=' '))
            {
                count++;

            }

        }
        System.out.println("The number of words in the String are : " + count);
    }
}
