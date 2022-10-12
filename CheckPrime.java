import java.util.Scanner;
class CheckPrime
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int i,temp=0;
        for(i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp>0)
        {
            System.out.println(n+"Is Not a prime number:");
        }
        else
            System.out.println(n+ "Is Prime number:");

    }
}
