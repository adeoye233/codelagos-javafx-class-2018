/**
 *
 * @author ADEOYE A. SAHEED
 */
public class CompoundInterest {
    public static void main(String []args)
    {
       // formula to find compound interest 
       // A = P(1+r/n)nt
       // where
       // A = ending amount
       // P = Principal
       // R = interest rate
       // N = Number of compounding a year
       // T = Total number of years
        
        // declaring the variable of the formula and assigning values to them
        // ci variable is the compound interest as the result
                double amount=0,principle=1000,rate=10,time=3,ci;
                
                System.out.println("principle = "+principle);
                System.out.println("rate = "+rate);
                System.out.println("time = "+time);
                
            // calculating for amount 
                amount = principle*((1+rate/100) * (1+rate/100) * (1+rate/100));
                
                System.out.println("amount = "+amount);
                
                ci = amount-principle;
                
               // printing out the the final result for ci
                System.out.println("compound interest = "+ci);
    }
    
}
