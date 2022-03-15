package homeworkweek_06;

import java.awt.geom.Area;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        double w, h;
        Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter Width value:");//Enter Width value:
        w = rectangle.nextDouble();//input width
        System.out.println("Enter Height value:");//Enter Height value:
        h = rectangle.nextDouble();//input height
        double area = w * h;
        double peri = 2 * (w + h);

        System.out.println("Area of rectangle:" + (w) + "*" + (h) + "=" + area);//Area of rectangle:
        System.out.println("Perimeter of rectangle:" + 2 + "*" + ("(" + w + "+" + h + ")") + "=" + peri);//Perimeter of rectangle:

    }
}
