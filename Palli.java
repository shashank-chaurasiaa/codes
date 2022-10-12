import java.util.Scanner;
class Palli
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number:");
     int n=s.nextInt();
     int temp=n;
     int rem,y=0;
     while(temp!=0)
     {
         rem=temp%10;
         y=10*y+rem;
         temp=temp/10;
     }
     if(n==y)
     {
         System.out.println("Number is palindrome");
     }
     else
     {
         System.out.println("Not palindrome");
    }
}
}
