package week2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String mmonth = input.nextLine();
        String month= input.nextLine();


        String[] months ={"","jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};


        int[] days={0,31,28,31,20,31,30,31,31,30,31,30,31};
        for (int i=1; i<=12; i++){
            if (months[i].equals(month.toLowerCase())){
                if ( year %4 ==0 && year %100!=0 && month.toLowerCase().equals("feb")){
                    System.out.print(month+" "+year+" has 29 days!"); continue;
                }
                System.out.print(month+" "+year+" has "+days[i]+" days!");
            }
        }

    }
}
