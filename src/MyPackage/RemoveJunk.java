package MyPackage;

import java.util.Scanner;
public class RemoveJunk {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter the String :");
        String str = scn.nextLine();

        str=str.replaceAll("[^a-zA_Z0-9]","");
        System.out.println(str);

    }
}
