import java.util.Scanner;
class Fibbo
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int f,a=-1,b=1,i;
        for(i=1;i<=n;i++)
        {
            f=a+b;
            System.out.println(f);
            a=b;
            b=f;
        }
    }
}
