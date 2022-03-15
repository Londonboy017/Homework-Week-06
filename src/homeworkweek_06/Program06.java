package homeworkweek_06;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        double pi = 3.14159;
        double number;

        Scanner radius = new Scanner(System.in);// create an object of Scanner class
        System.out.println("Enter radius: ");//Enter radius:
        number = radius.nextDouble();//input radius value

        System.out.println("Area of circle: ");//Area of circle:
        System.out.println(pi * number * number);//equation of area of circle

    }
}
