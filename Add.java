import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        int c=a+b;
        System.out.print("c=:"+c);


    }
}
