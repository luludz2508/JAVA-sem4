package week2;

import java.util.Scanner;
import java.lang.String;
public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = input.nextLine();
        for (int i = sentence.length()-1; i >= 0; i--){
            System.out.print(sentence.charAt(i));
        }

    }
}
