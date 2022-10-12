import java.util.Scanner;
class Table
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number if you want table: ");
        int a=s.nextInt();
        int i;
        for(i=1;i<=10;i++){
               System.out.println(a*i);
           // System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
