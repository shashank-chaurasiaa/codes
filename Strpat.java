import java.util.Scanner;
class Strpat
{
    puiblic static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
       /* for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
                System.out.println();
        }

    }
}
