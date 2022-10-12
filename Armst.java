import java.util.Scanner;
public class Armst {
    public static void main(String[] args)
    {
       int num=121;
       int len=0;
       int t1=num;
       int rem;
      
     
       while(t1 !=0)
       {
       t1=t1/10;
       len=len+1;
       }

       int t2=num;
       int mul=1;
       int arm=0; 
       while(t2 !=0)

       {
        rem=t2%10;
        for(int i=1;i<=len;i++)
        {
            mul=mul*rem;
        }
        arm=arm+mul;
       }
       if(arm==num){
        System.out.println("armstrong number");
       }
       else
       {
        System.out.println("not a Armstrong number");
       }
    }
    
}
