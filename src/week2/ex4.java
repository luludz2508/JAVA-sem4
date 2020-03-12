package week2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.lang.String;
public class ex4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<String>();
        System.out.print("Enter the first city: ");
        cities.add(input.nextLine());
        System.out.print("Enter the second city: ");
        cities.add(input.nextLine());
        System.out.print("Enter the third city: ");
        cities.add(input.nextLine());
        Collections.sort(cities);
        System.out.print("The three cities in alphabetical order is "+ cities.get(0)+" - "+ cities.get(1)+" - "+cities.get(2));

        System.out.print("\nThe three cities in alphabetic orders is : \n");
        for (String i : cities) {
            System.out.println(i+"  ");
        }
    }
}
