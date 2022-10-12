import java.util.Scanner;
class Calculator
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the first number:");
     int no1=s.nextInt();
     System.out.println("Enter the second number:");
     int no2=s.nextInt();
     System.out.println("Choice the Symbols(+,-,*,/) ");
     String sym=s.next();
     int res;
     switch(sym)           // in the braces we have write the variable to be tested
     {
     case "+":
        res=no1+no2;
        System.out.println("Addition is :"+res);
        break;
     case "-":
        res=no1-no2;
        System.out.println("Subtraction is :"+res);
        break;
     case "*":
        res=no1*no2;
        System.out.println("Multiplication is :"+res);
        break;
     case "/":
        res=no1/no2;
        System.out.println("Divide is :"+res);
     default:
        System.out.println("Invalid symbol:");
        break;


     }
  }
}
