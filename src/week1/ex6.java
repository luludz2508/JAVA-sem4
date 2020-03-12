package week1;

import java.util.Scanner;
import java.lang.Math;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This application determine the center coordinates and radiuses of 2 circles to detect do the second one inside the first one or not!");
        System.out.print("Please enter the center coordinates and radius of the First Circle: ");
        double circle1x = input.nextDouble() , circle1y = input.nextDouble() , circle1r = input.nextDouble();
        System.out.print("Please enter the center coordinates and radius of the Second Circle: ");
        double circle2x = input.nextDouble() , circle2y = input.nextDouble() , circle2r = input.nextDouble();
        double distance = Math.sqrt( Math.pow((circle1x-circle2x),2) + Math.pow((circle1y-circle2y),2) );

        if ( distance <= Math.abs(circle2r-circle1r) && circle2r < circle1r){
            System.out.print("Circle 2 is inside circle 1");
        }else if ( distance <= Math.abs(circle2r-circle1r) && circle1r < circle2r){
            System.out.print("Circle 1 is inside circle 2");
        } else if ( distance > Math.abs(circle1r-circle2r) && distance< Math.abs(circle1r+circle2r)){
            System.out.print("Circle 1 and circle 2 overlaps each other");
        } else {
            System.out.print("Circle 1 and Circle 2 is outside each other");
        }

    }
}
