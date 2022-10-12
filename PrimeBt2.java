import java.util.Scanner;
class PrimeBt2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the lower number:");
        int l=s.nextInt();
        System.out.println("Enter the upper number:");
        int u=s.nextInt();
        int i,x;
        for(x=l+1;x<=u-1;x++){
            for(i=2;i<=x-1;i++)
                if(x%i==0)
                break;
            if(i==x)
                System.out.println(+x);
        }
    }
}




