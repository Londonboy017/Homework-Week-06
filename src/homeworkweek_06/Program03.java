package homeworkweek_06;

public class Program03 {
    String name="banana";//instance var.
    static String  a="apple";//static var.

    //Decalre instance method
    public void apple(){
        System.out.println(name);//call static var.
        System.out.println(a);//call instance var.
    }
    //Decalre static method
    public static void banana(){
        Program03 fruit=new Program03();//creat object
        System.out.println(fruit.name);//call instance var via object
        System.out.println(a);//call static var.
    }
    //Declare main method
public static void main(String[]args){
        Program03 xyz=new Program03();//create object
        xyz.apple();//call instance method via object
        banana();//call static method
}
}
