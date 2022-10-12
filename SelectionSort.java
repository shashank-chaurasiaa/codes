public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int[] a={5,9,3,10,11,8};
        int min;
        int i,j,temp=0;
        for( i=0;i<a.length;i++)
       
        {
            min=i;
            for( j=i+1;j<a.length;j++)
            {
                if(a[min] > a[j])
                {
                    min=j;
                }
                

            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(i=0;i<a.length;i++){

        System.out.println(a[i]);
        }
    }
}
