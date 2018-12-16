/**
 *
 * @author ADEOYE A. SAHEED
 */

import java.util.Scanner;
public class Login {
    public static void main(String []args)
    {
        int user;
        int pass;
        
        //creating an object of the scanner class to accept input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter username");
        user = input.nextInt();
        
        System.out.println("Enter password");
        pass = input.nextInt();
        
        if((user == 01)&&(pass == 123))
               
        {
            System.out.println(" Welcome to Login Page");
        }
        else {
            System.out.println("Incorrect Username or Password");
        }
        
        
        
        
    }
    
}
