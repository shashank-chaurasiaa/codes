import java.util.Scanner;
public class Rangeprime
 {
    public static void main(String[] args) 
    {
        int temp=0,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int l=s.nextInt();
        int r=s.nextInt();
        for(i=l+1;i<r;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
            }
        
        if(temp==0)
        {
            System.out.println(i);
        }
        else
        {
            temp=0;
        }
    }
      
}
        
 }
