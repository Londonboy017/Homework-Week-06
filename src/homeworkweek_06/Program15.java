package homeworkweek_06;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner apple =new Scanner(System.in);// create an object of Scanner class
        System.out.println("Enter number a:");//Enter number a:
        a = apple.nextInt();
        System.out.println("Enter number b:");//Enter number b:
        b=apple.nextInt();
        System.out.println("After swapping:");//After swapping:
        System.out.println("a="+b);
        System.out.println("b="+a);

    }
}
