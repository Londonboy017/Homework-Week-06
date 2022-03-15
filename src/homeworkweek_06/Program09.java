package homeworkweek_06;

import java.util.Scanner;

public class Program09 {

    public static void main(String[] args) {

            Scanner lower=new Scanner(System.in);
            System.out.print("Sample Input:");
            String line=lower.nextLine();
            line=line.toLowerCase();
            System.out.println(line);
    }
}

       /* char up;
        Scanner abc = new Scanner(System.in);// create an object of Scanner class
        System.out.println("Enter a character in Uppercase:");//Enter a character in Uppercase:
        up = abc.next().charAt(0);

        int ascii = up;
        if (ascii >= 65 && ascii <= 90)//range of upper case in ascii
             {
            ascii = ascii + 32;
            char lo = (char) ascii;
            System.out.println("Lowercase character: " + lo);
        } else if (ascii >= 97 && ascii <= 122)//range of lower case in ascii
            System.out.println("Character is already in lowercase");//Character is already in lowercase
        else
            System.out.println("invalid input");//invalid input

    }

        /*ascii=up;
        ascii=ascii+32;
        lo=(char) ascii;
        System.out.println("Equivalent Character in Lowercase = " +lo);

    */




