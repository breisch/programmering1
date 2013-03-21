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
public class HashTabell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> ht = new HashMap<>();
        ht.put("sverige","Stockholm");
        ht.put("Danmark","köpenhamn");
        ht.put("Norge","oslo");
        ht.put("Ryssland","Moskva");
        ht.put("Frankrike","paris");
        System.out.println("Land?");
        String land = sc.nextLine();
        while (!land.equalsIgnoreCase("#")) {
            System.out.println("Huvudstad: "+ht.get(land));
            System.out.print("Land?");
            land = sc.nextLine();
        }//End while
        System.out.println("hej");
    }//End main
}//End class
