package week2;

import java.util.Scanner;
import java.lang.String;
import static java.lang.Character.isLetter;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to check whether it is the Palindrome or not: ");
        String newstring = input.nextLine();
        String clearedString= "" ;
        for (int i=0; i<=newstring.length()-1; i++ ){
            if (isLetter(newstring.charAt(i))){
                char sub = newstring.charAt(i);
                clearedString=clearedString+sub;
            }
        }
        String test="";
        // First case
        if (clearedString.length() %2 ==0){
            int length = clearedString.length();
            test= clearedString.substring(0,length/2-1);
            for (int i = length/2-1; i <= length-1; i++){
                char sub = clearedString.charAt(i);
                test=test+sub;
            }
            if (test.equals(clearedString)){
                System.out.print("The given sentence are palindromes.");
            }
        }
        //Second case
        if (clearedString.length() %2 !=0){
            int length = clearedString.length();
            test= clearedString.substring(0,length/2+1);
            for (int i = length/2+1; i <= length-1; i++){
                char sub = clearedString.charAt(i);
                test=test+sub;
            }
            if (test.equals(clearedString)){
                System.out.print("The given sentence is a palindrome.");
            }
        }
    }


}
