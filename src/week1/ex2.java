package week1;

import java.util.*;

public class ex2 {
    public static void main(String[] ags) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celcius: ");
        double celsius = input.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;

        //Display output
        System.out.println(celsius+" C in fahrenheit is: "+fahrenheit);
    }
}