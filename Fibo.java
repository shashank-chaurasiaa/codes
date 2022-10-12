import java.util.Scanner;
public class Fibo {
    public static void main(String[] args){
       
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        int a=0,b=1;
        System.out.println("fibonacci series is");
        System.out.print(a+" "+b);
        
        for(int i=1;i<=n;i++){
             c=a+b;
             System.out.print(" "+c);
             a=b;
             b=c;

        }
    }
    
}
