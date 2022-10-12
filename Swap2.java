import java.util.Scanner;
class Swap2
{
   public static void main(String[] args)
    {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the numbers:");
         int a=s.nextInt();
         int b=s.nextInt();
         System.out.println("Before the swapping a="+a);
         System.out.println("Before the swapping b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After the swapping a="+a);
        System.out.println("After the swapping b="+b);

    }

  /*  public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Before swapping a ="+a);
        System.out.println("Before swapping b ="+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping a ="+a);
        System.out.println("After swapping b ="+b);
    } */
}
