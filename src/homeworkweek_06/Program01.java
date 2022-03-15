package homeworkweek_06;

public class Program01 {
    int a=1;//instance variable
    int b=2;//instance variable

    //Decalre instance method
    public void addition(){
        System.out.println(a);//we can direct call variable in instance method
        System.out.println(b);
    }
    //Decalre instance method
    public void substraction(){
        System.out.println(a);//calling instance variable
        System.out.println(b);

    }
    //Declare main method
    public static void main(String []args){
        Program01 london=new Program01();//object creation
        london.addition();//calling instance method via object
        london.substraction();
    }
}
