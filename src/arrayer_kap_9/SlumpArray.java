/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayer_kap_9;

/**
 *
 * @author Gustav Breisch
 */
public class SlumpArray {
    public static void main(String[] args) {
        int n = 100;
        
        int [] a = new int[n];
        
        System.out.println("Arrayens element slumpas och skrivs ut");
        
        for (int i = 0; i < a.length; i++) {
            if (i % 10 ==0) {
                System.out.println("");
            }
            a[i] = (int)(1000 * Math.random());
            System.out.print(a[i]+"\t");
            
        }//End for
    }//End main
}//End class
