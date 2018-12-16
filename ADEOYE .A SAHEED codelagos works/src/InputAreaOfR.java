/**
 *
 * @author ADEOYE A. SAHEED
 */

import java.util.Scanner;

public class InputAreaOfR {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("formula for calculating Area of Rectang is Lenght * Breadth");
        System.out.print("Enter a value for Lenght:");
        int L = input.nextInt();
        
        System.out.print("Enter a value for Breadth:");
        int B = input.nextInt();
        
        int Rectangle = L*B;
        System.out.println("Area of Rectangle = "+Rectangle);
    }
    
}
