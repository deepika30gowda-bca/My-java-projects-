import java.util.scanner;
public class division_by_zero_exception
{
    public static voidmain (String args[])
    {
        try {
            int number1, number2, output;
            scanner sc = new scanner (system.in);
            system.out.println("Enter first number:");
            number1 = sc.nextInt();
            system.out.println("Enter second number:");
            number2 = sc.nextInt();
            output = number1 / number2;
            System.out.println("Result : " + output);
        }
        catch(ArithmeticException e)
        {
            System.Out.println("Error : " + e.getmessage());
            System.Out.println("Error : " + e);
        }
        System.out.println("End of program ...");
    }
}
