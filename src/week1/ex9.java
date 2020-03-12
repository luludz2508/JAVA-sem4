package week1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter 1 integer from 1 to 15 to build a pyramid: ");
        int levels= input.nextInt();
        if (levels <=0 || levels>15){
            System.out.print("Invalid number of levels!");
        }
        for (int i=1; i <=levels; i ++){
            int leftspace= levels-i;
            for (int a=1; a <=leftspace; a++){
                System.out.print("    ");}
            for ( int b=i ; b > 0 ; b--){
                System.out.printf("%2d  ",b);
            }
            for(int c=2;c<=i; c++){
                System.out.printf("%2d  ",c);
            }
            System.out.print("\n");

        }

    }
}
