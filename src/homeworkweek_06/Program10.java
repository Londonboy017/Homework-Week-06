package homeworkweek_06;

import com.sun.xml.internal.ws.server.sei.EndpointResponseMessageBuilder;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Scanner multi = new Scanner(System.in);// create an object of Scanner class

        System.out.println("Input a number:");//Input a number:
        int num1 = multi.nextInt();
        for (int a = 0; a < 10; a++) {
            System.out.println(num1 + "x" + (a+1) + "=" + (num1 * (a + 1)));
        }

    }
}
