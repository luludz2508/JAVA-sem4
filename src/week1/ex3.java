package week1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an positice interger please!:");
        int interger = input.nextInt();
        int Sumdigit=0;
        while (interger % 10 != 0){
            Sumdigit=Sumdigit + (interger%10);
            interger= interger/10;

        }
        System.out.print("The sum of all digit is: "+Sumdigit);




    }
}
