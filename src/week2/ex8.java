package week2;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class ex8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the String to encrypt: ");
        String noten = input.nextLine();
        StringBuilder encrypted = new StringBuilder();
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String code ="QTGABCDEFHIJKLMNOPRSUVWXYZqtgabcdefhijklmnoprsuvwxyz";
        for ( int i =0; i < noten.length(); i++){
            if (isLetter(noten.charAt(i))== false){
                encrypted.append(noten.charAt(i)); continue;
            }
            for (int j =0; j< 52; j++){
                if ( noten.charAt(i) == alphabet.charAt(j)){
                    encrypted.append(code.charAt(j));
                }
            }

        }
        System.out.print("Encrypted code is : "+encrypted);
    }
}
