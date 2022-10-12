import java.util.Scanner;
class Strpat2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int N=s.nextInt();
       /* for(int i=1;i<=N;i++)
        {
            for(int j=N;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        } */
        for(int i=1;i<=N;i++)
        {
            for(int j=N;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

