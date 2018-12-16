/**
 *
 * @author ADEOYE A. SAHEED
 */

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[])
    {
        int n=5;
        ArrayList <Integer> values=new ArrayList<>(n);
        
        values.add(100);
        values.add(200);
        values.add(300);
        values.add(400);
        values.add(500);
        
        System.out.println("Element at index0: " + values.get(0));
        System.out.println("Element at index1: " + values.get(1));
        System.out.println("Element at index2: " + values.get(2));
        System.out.println("Element at index3: " + values.get(3));
        System.out.println("Element at index4: " + values.get(4));
    }
    
}
