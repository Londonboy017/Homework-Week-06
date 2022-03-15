package homeworkweek_06;
import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        double h,b;
        int w=2;

        Scanner area=new Scanner(System.in);// create an object of Scanner class
        System.out.println("Enter base value: ");//Enter base value:
        b=area.nextDouble();//Input base value
        System.out.println("Enter perpendicular hight value: ");//Enter perpendicular height value:
        h=area.nextDouble();// input height value
        System.out.println("Area of Triangle: " );//Area of Triangle:
        System.out.println((h*b)/w);//Output value

    }
}
