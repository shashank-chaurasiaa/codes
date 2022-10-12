class LeapYear
{
    public static void main(String[] args)
    {
        int y=2019;
        if((y%4==0)||(y%400==0 && y%100!=0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }

}
