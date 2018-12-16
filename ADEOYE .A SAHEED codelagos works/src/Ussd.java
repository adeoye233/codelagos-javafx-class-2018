/**
 *
 * @author ADEOYE A. SAHEED
 */

// a sample application of how USSD code runs
// im,porting a scanner class to be able to accept input from user
import java.util.Scanner;
 
// declaration of class of USSD
public class Ussd {
    // declaring a main method to be able to run the program
    public static void main(String args[])
    {
        // creating an instance of scanner class as input
        Scanner input = new Scanner(System.in);
         
        // declaring input variable as integer
        int value;
        // first output message to the console screen
        System.out.print("Please enter ");
        System.out.print("  1: for airtime ");
        System.out.print("  2: Data  ");
        System.out.print("  3: selfcare  ");
        
        //accepting the input value from user
        value = input.nextInt();
        
        // checking if the value input meet with the conditional statement from the main menu
        if (value==1)
        {
            System.out.println("request for airtime \n 1: prepaid \n 2: postpaid");
            // declaring another integer value base on the user input
            int airtime = input.nextInt();
            
            // creating a switch case inside the "IF statement" for sub menu for user
            switch (airtime) {
                case 1:
                    System.out.println("Prepaid recharge succesfuly");
                    break;
                case 2:
                    System.out.println("postpaid airtime recharge succefully");
                    break;
                    // the default is going to print when the user enter a wrong value
                default:
                    System.out.println("ivalid input");
                    break;
            }
            
        }
        else if(value == 2)
        {
            System.out.println("Data mode \n 1: daily \n 2: weekly \n 3: monthly");
            int data = input.nextInt();
            switch (data) {
                case 1:
                    System.out.println("Daily data subscribe succesfully exp: after 24hr");
                    break;
                case 2:
                    System.out.println("Weekly data activated with 20% bonus exp: after 7days");
                    break;
                case 3:
                    System.out.println("Monthly Data activated succesfuly with 70% bonus exp: after 30days ");
                    break;
                default:
                    System.out.println("invalid data code");
                    break;
            }
        }
        else if(value == 3)
        {
            System.out.println("Self care \n 1: Swap\t 2: office location\t 3:chat");
           int self=input.nextInt();
            switch (self) {
                case 1:
                    System.out.println("Transaction in progress...");
                    break;
                case 2:
                    System.out.println("Please ask a friend");
                    break;
                case 3:
                    System.out.println("Pls hold while ur chat is been transfered to a customer care agent");
                    break;
                default:
                    System.out.println("Please try again later");
                    break;
            }
            
        }
        else 
        {
            System.out.println("invlaid input \n please enter from 1-3");
        }
                
    }
    
}
