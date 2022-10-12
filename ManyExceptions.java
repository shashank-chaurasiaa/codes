import java.util.*;

public class ManyExceptions{
    public void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args){

        try{
            System.out.println("The third argument is " + args[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println("Enter another number");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println("The result of the division is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Illegal division");
        }

        sc.close();

        try {
            int d = sc.nextInt();
        }
        catch(IllegalStateException e){
            System.out.println("Scanner already closed");
        }


        ManyExceptions me = new ManyExceptions();
        me = null;

        try {
            me.sayHello();
        }
        catch(NullPointerException e){
            System.out.println("Object is Null");
        }


        System.out.println("The program is Executed successfully till last line");

    }
}