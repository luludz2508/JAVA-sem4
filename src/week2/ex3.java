package week2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers;

        while (true) {
            int fasle = 1;
            System.out.print("Enter list: ");
            int number = input.nextInt();
            numbers= new int[number+1];
            if (number == 0){
                break;
            }
            for (int i =0 ; i< number; i++){
                numbers[i]= input.nextInt();
            }
            for (int i =0 ; i< number-1; i++){
                if (numbers[i] < numbers[i + 1]) {
                    fasle = 0;
                } else{
                    fasle =1; break;
                }
            }
            if (fasle == 1){
                System.out.println("The list is not sorted!");
            } else if ( fasle == 0 ){
                System.out.println("The list is sorted!");
            }
        }
    }
}
