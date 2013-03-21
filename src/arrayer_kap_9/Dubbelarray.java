/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayer_kap_9;

import java.util.Arrays;

/**
 *
 * @author Gustav Breisch
 */
public class Dubbelarray {
    public static void main(String[] args) {
   
        int[] a = {1,2,3};
        
        int[] b = {1,2,3};
        
        boolean koll = Arrays.equals(a, b);
        
        if (koll == true){
            System.out.println("lika");
        }else{
            System.out.println("Olika");
        }
        
        
    }//end main
}//end class
