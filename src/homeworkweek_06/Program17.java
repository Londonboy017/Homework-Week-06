package homeworkweek_06;
import java.util.Scanner;
public class Program17 {

    public static void main(String[] args) {

    int a;
    Scanner bin=new Scanner(System.in);//create an object of Scanner class

        System.out.println("Enter a decimal number:");//Enter a decimal number:
        a= bin.nextInt();//Enter a decimal number
        System.out.println("Binary number is:"+Integer.toBinaryString(a));//Binary number is:
}
}