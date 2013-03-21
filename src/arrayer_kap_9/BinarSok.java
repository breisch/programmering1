/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayer_kap_9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gustav Breisch
 */
public class BinarSok {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = {20, 56, 66, 89, 23};
        Arrays.sort(arr);
        int max, min, t, pos, mitten;
        min = 0;
        max = arr.length -1;
        
        System.out.println("Vilket heltal soker do?");
        t=sc. nextInt();
        
        pos=-1;
        while (min <= max && pos ==-1) {
            mitten = (max + min)/2;
            if (t > arr[mitten]){
                min = mitten+1;
            }else if(t < arr[mitten]){
                max = mitten -1;
            }else{
                pos = mitten;
            }
        }//End while
        
        if(pos == -1){
            System.out.println("talet hittades inte.");
        }else{
            System.out.println("Talet finns i element nummer "+pos);
        }
        
        
    }//end main
}//End class
