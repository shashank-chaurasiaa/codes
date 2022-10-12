import java.util.Scanner;
public class  Primenum
{
    public static void main(String[] args) 
    {
        int temp=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)                       // or 
            {                                //break;
                temp=temp+1;
                                             // if sop
                                             //else
            }
        }
            if(temp>0)
            {
                System.out.println("not a prime number");
            }
            else
            {
                System.out.println("prime number");
            }
        

    }
}