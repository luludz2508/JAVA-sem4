package week2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers;
        numbers =new int[101];
        System.out.print("Please enter integers between 0 and 100. Finish with 0: ");
        while (true){
            int number =input.nextInt();
            if (number != 0){
                numbers[number] ++;
            } else { break; }
        }
        for (int i =1; i<=100; i ++){
            if (numbers[i] == 1){
                System.out.println(i +" occurs 1 time.");
            }else if (numbers[i]>1){
                System.out.println(i +" occurs "+ numbers[i]+ " times." );
            }
        }
    }
}
