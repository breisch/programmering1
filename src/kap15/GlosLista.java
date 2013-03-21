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
public class GlosLista {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> ht = new HashMap<>();
        int val;
        int fortsatt=0;
        int ratt=0;
        while (fortsatt==0) {
         System.out.println("Vad vill du göra?!?");
        System.out.println("1.Lägg till glosor");
        System.out.println("2.Visa gloslista");
        System.out.println("3.Skriv in en ny glosa");
        System.out.println("4.Glostest");
        System.out.println("0.Kuken");
        System.out.println("Välj: ");
        val= sc.nextInt();
        String svar;
        switch (val) {
            case 1:
                ht.put("sol","sun");
                ht.put("måne","moon");
                ht.put("regn","rain");
                ht.put("snö","snow");
                
                break;
            case 2:
                for (String nyckel : ht.keySet()) {
                    System.out.println(nyckel+"=");
                    System.out.println(ht.get(nyckel));
                }
                break;
            case 3:
                System.out.println("Lägg till en ny glosa");
                System.out.println("Skriv in den svenska ordet: ");
                String SvenskGlosa = sc.next();
                System.out.println("Skriv in den engelska ordet: ");
                String EngelskGlosa = sc.next();
                ht.put(SvenskGlosa, EngelskGlosa);
                break;
            case 4:
                for (String nyckel : ht.keySet()) {
                    System.out.println("Vad heter "+nyckel+" på engelska?");
                    svar = sc.next();
                    if (svar.equals(ht.get(nyckel))) {
                        System.out.println("Rätt");
                        ratt++;
                    }else{
                        System.out.println("Fel där");
                        System.out.println("Rätt svar var "+ht.get(nyckel));
                    }//End if else
                }//End for
                System.out.println("Du fick "+ratt+" antal rätt");
                break;
            case 0:
                fortsatt=1;
                break;
            default:
                throw new AssertionError();
            }//End switch   
        }//End while
        System.out.println("Du valde att avsluta. Avslutar");
        
    }//End main
}//End Class
