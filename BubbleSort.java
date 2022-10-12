import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int temp,n;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the number");
        n=s.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("elements are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

        for(int i=0;i<a.length;i++)
        {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;

                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    
}
