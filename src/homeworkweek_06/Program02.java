package homeworkweek_06;

public class Program02 {
    static int a = 1;//Static var.
    static String name = "Inida no."; //Static var.

    //Static method
    public static void myIndia() {
        System.out.print(name);//call static var.
        System.out.println(a);//call static var.
    }

    //Declare main method
    public static void main(String[] args) {
        myIndia();//call the static method
    }

}

