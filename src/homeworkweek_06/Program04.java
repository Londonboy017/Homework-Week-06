package homeworkweek_06;

public class Program04 {
    int a = 1;//Instance variable
    int b = 2;//Instance variable
    static int c = 3;//Statice variable
    static int d = 4;//Statice variable

    //declare instance method
    public void sum() {
        System.out.println(a + b + c + d);//Calling Instance variable &Statice variable

    }

    //Declare static method
    public static void add() {
        Program04 wed = new Program04();//Create object

        System.out.println(wed.a + wed.b + c + d);//Calling Instance variable &Statice variable
    }
    //Declare main method
    public static void main(String[] args) {
        Program04 docs = new Program04();//Create object
        docs.sum();//Calling Instance method
        add();//calling main method
    }
}
