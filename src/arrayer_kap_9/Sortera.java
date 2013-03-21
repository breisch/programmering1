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
public class Sortera {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        System.out.println("Här skrivs listan ut: ");
        
        for (int i = 0; i < n; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            a[i]= (int)(1000 * Math.random());
            System.out.print(a[i] + "\t");
        }//End for
        
        //Arrays.sort(a);
        int s;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i]> a[j]) {
                    s = a[i];
                    a[i]=a[j];
                    a[j] = s;
                }//End if
            }//End forfor
        }//End for
        
        System.out.println("Den sorterade listan skruvs ut");
        for (int i = 0; i < n; i++) {
            if (i % 10 ==0) {
                System.out.println();
            }//End if
            System.out.print(a[i]+ "\t");
        }//End for
        
    }//end main
}//End class
