import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creating necessary variables and instance of Scanner class
        int base, exponent, result = 1;
        Scanner scan = new Scanner(System.in);
        //Getting values with prompting user
        System.out.println("Enter the base number: ");
        base = scan.nextInt();

        System.out.println("Enter the exponent number:");
        exponent = scan.nextInt();
        //Multiplying variable of result inside for loop
        //to get exponent of base
        for(int i=1; i<=exponent; i++)
        {
            result *= base;
        }
        System.out.println(base +" to power " + exponent + " is equal to " + result);
    }
}
