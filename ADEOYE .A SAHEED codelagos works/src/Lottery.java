/**
 *
 * @author ADEOYE A. SAHEED
 */

import java.util.*;
public class Lottery {
    public static void main(String args[])
    {
        public ArrayList<Integer> generateNumbers();
        {
        int n=5;
        //values to be generated
        int generate;
        
        ArrayList<Integer> values = new ArrayList<>(n);
        
        // Exit the loop when the size of the ArrayList is 6
        
        while(values.size()<6)
        {
            generate = (int)(Math.random()*36+1);
            
            // filter out duplicate values
            
            if(!values.contains(generate))
            {
                values.add(generate);
            }
            
        }// return values;
        
    }
}
    
}
