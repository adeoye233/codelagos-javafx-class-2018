/**
 *
 * @author ADEOYE A. SAHEED
 */

// addition in java

import java.util.Scanner; 
// calling the scanner class to accept input from user

public class Addition
{
	public static void main(String []args)
	{
		//creating a scanner object to accept input
		Scanner input = new Scanner(System.in);

		int number1; // first number
		int number2; // second number
		int sum; //sum of number1 and number2

		System.out.print("Enter first interger: "); // prompt user to enter 1st number
		number1 = input.nextInt(); // reading first number from user

		System.out.print("Enter second number"); // prompt user to enter second number
		number2 = input.nextInt(); //reading second number from user

		sum = number1 + number2; // adding number1 and number2 nd storing total in sum

		System.out.printf("sum is %d\n", sum);// display total of number1 nd number2
	}

    @Override
    public String toString() {
        return "Addition{" + '}';
    }
}