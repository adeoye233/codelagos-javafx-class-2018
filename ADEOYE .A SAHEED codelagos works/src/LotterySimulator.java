/**
 *
 * @author ADEOYE A. SAHEED
 */

import java.util.*;
public class LotterySimulator {
    public static void main(String args[])
    {
        Lottery lottery = new Lottery();
        
        ArrayList<Integer> values = lottery.generateNumbers();
        
        System.out.println(values.get(0));
        System.out.println(values.get(1));
        System.out.println(values.get(2));
        System.out.println(values.get(3));
        System.out.println(values.get(4));
        System.out.println(values.get(5));
    }
    
}
