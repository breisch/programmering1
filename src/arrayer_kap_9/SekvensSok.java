/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayer_kap_9;

import java.util.Scanner;

/**
 *
 * @author Gustav Breisch
 */
public class SekvensSok {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int[] arr={13,15,7};
        int pos =-1;
        System.out.println("Vilket heltal söker do?");
        int t = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if(t == arr[i]){
            pos = i;
            i=arr.length;//Loopen slutar
            }else{}
        }//End for
        
        if(pos == -1){
            System.out.println("Talet hittades ej.");
        }else{
            System.out.println("Talet finns i elementet "+pos);
        }
        
        
    }//main
}//class
