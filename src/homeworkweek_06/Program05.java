package homeworkweek_06;

import java.util.Scanner;

public class Program05 {
    static double a,b;
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = calc.nextDouble();

        System.out.println("Enter second number:");
        b = calc.nextDouble();

        addition();
        subtraction();
        Program05 gun=new Program05();
        gun.division();
        gun.multiplication();
    }

        public static void addition()
    {double sum=a+b;
        System.out.println("Addition of two numbers:"+sum);
        }
public static void subtraction(){
        double sub=a-b;
    System.out.println("Subtraction of two numbers:"+sub);
}
public void multiplication(){
        double mult=a*b;
    System.out.println("Multiplication of thw number:"+mult);
}
public void division(){
double div=a/b;
    System.out.println("Division of two number:"+div);


}


    }



    /*
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        //ask users to enter operator
        System.out.println("Choose an operator:+,-,*,/");
        operator = input.next().charAt(0);

        // ask users to enter first numbers
        System.out.println("Enter first number:");
        number1 = input.nextDouble();

        // ask users to enter second numbers
        System.out.println("Enter Second number:");
        number2 = input.nextDouble();

        switch (operator) {
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;

            case '-'://perform substraction between numbers
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            case '*':// perform multiplication between numbers
                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;
            case '/'://perform division between numbers
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
*/

