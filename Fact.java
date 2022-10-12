import java.util.Scanner;
class Fact{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
            System.out.println("Factorial of given number is ="+f);

    }
}
