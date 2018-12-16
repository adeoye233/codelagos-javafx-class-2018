/**
 *
 * @author ADEOYE A. SAHEED
 */
public class RandomN {
    public static void main(String args[])
    {
        int n;
        int count = 0;
        
        while (count < 3)
        {
            n = (int)(Math.random()*9+3);
                    System.out.println(n);
                    count++;
        }
    }
    
}