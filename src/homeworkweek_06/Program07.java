package homeworkweek_06;

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        double f; //fahrenheit value
        int a = 32, b = 5, d = 9;
        Scanner temp = new Scanner(System.in);// create an object of Scanner class
        System.out.println("Enter Fahrenheit value: ");//Enter Fahrenheit value:
        f = temp.nextDouble();//input fahrenheit value

        System.out.println("Temperature in celsius: ");//Temperature in celsius:
        System.out.println((f - a) * b / d);//output celsius value

    }
}
