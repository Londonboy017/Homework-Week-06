package homeworkweek_06;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner avg=new Scanner(System.in);// create an object of Scanner class
        System.out.println("Enter first number:");//Enter first number:
        a= avg.nextDouble();//input first number
        System.out.println("Enter second number:");//Enter second number:
        b=avg.nextDouble();//input second number
        System.out.println("Enter third number:");//Enter third number:
        c=avg.nextDouble();//input third number
        System.out.println("Average of above numbers:");//Average of above numbers:
        System.out.println((a+b+c)/3);

    }

}
