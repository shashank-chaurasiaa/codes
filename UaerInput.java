import java.util.Scanner;
class UaerInput
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);     // object for user input
        System.out.println("enter the name:");
        String name=s.next();
        System.out.println("enter the gender:");
        char gender=s.next().charAt(0);
        System.out.println("enter the age:");
        int age=s.nextInt();
        System.out.println("enter the phone number:");
        long ph no.=s.nextLong();
        System.out.println("------------------------------");
        System.out.println("Name :"+name);
        System.out.println("Gender : :"+gender);
        System.out.println("Age :"+age);
        System.out.println("Phno :"+ph no);
    }
}
