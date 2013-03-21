/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Gustav Breisch
 */
public class HashTabell2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> ht = new HashMap<>();
        boolean fortsatt=true;
        int antalratt=0;
        while (fortsatt) {
            
        
        
        System.out.println("Vad vill du göra?");
        System.out.println("1. Skapa hashtabellen");
        System.out.println("2. Sök huvudstad");
        System.out.println("3. Visa hastabellens innehåll");
        System.out.println("4. Geografiförhör");
        System.out.println("0. Avsluta");
        int svar = sc.nextInt();
        
        switch (svar) {
            case 1:
                ht.put("sverige","Stockholm");
        ht.put("Danmark","köpenhamn");
        ht.put("Norge","oslo");
        ht.put("Ryssland","Moskva");
        ht.put("Frankrike","paris");
                System.out.println("smooth");
                
                break;
            case 2:
                System.out.println("Land? ");
                String land = sc.next();
                System.out.println("Huvudstad: "+ht.get(land));
                break;
            case 3:
                for (String nyckel : ht.keySet()) {
                    System.out.println(nyckel +": ");
                    System.out.println(ht.get(nyckel));
                }
   
                break;
            case 4:
                for (String nyckel : ht.keySet()) {
                    System.out.println("Vad heter huvudstaden i "+nyckel+": ");
                    String svaret = sc.next();
                    if (svaret.equals(ht.get(nyckel))) {
                        System.out.println("Rätt");
                        antalratt++;
                    }else{
                        System.out.println("wrong");
                        System.out.println("Fel! rätt svar är "+ht.get(nyckel));
                    }
                }
                break;
            case 0:
                
                break;
        }
        }//End while
        System.out.println("hej");
        System.out.println("du fick "+antalratt+" rätt");
    }//End main
}//End class
