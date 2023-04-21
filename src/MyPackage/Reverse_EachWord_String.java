package MyPackage;

import java.sql.SQLOutput;

public class Reverse_EachWord_String {
    public static void main(String[] args) {

        //Approach 1
        String s = "Welcome to the Testing";
//        String revereString="";
//        String[] words =s.split(" ");
//
//        for(String w:words){
//
//            String reverseWord= "";
//            for(int i= w.length()-1; i>=0; i--)
//            {
//
//                reverseWord = reverseWord + w.charAt(i);
//
//            }
//            revereString = revereString+ reverseWord+ " ";
//
//        }
//        System.out.println("the Reverse word is: "+ revereString);
//

        //Approach 2

        String[] words = s.split("\\s");

        String reverseword="";
        for(String w : words)
        {
            StringBuilder rs = new StringBuilder(w);
            rs.reverse();
            reverseword= reverseword+rs.toString() + " ";

        }
        System.out.println("The reverse word is: "+reverseword);

    }
}
