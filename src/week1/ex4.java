package week1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter three positive intergers please: ");
        int inter1 = input.nextInt();
        int inter2 = input.nextInt(), interger1=0, interger2=0;
        if (inter2 > inter1) {
            interger1 =inter2;
            interger2 =inter1;
        } else {

            interger1 =inter1;
            interger2 =inter2;
        }
        int inter3 =input.nextInt(), num1,num2,num3;
        if (inter3 > interger1){
            num1=inter3;
            num2=interger1;
            num3=interger2;
        } else if ( inter3 > interger2) {
            num1=interger1;
            num2=inter3;
            num3=interger2;
        } else {
            num1=interger1;
            num2=interger2;
            num3=inter3;
        }
        System.out.print("The Ascending order of 3 numbers is: "+num3+"\t"+num2+"\t"+num1);
    }
}
