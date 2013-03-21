/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gustav Breisch
 */
public class LankadLista {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> namnLista = new ArrayList<>();
        int val=1;
        String namn;
        int plats;
        
        
        boolean fortsatt=true;
        while (fortsatt) 
        {
                if (namnLista.isEmpty()) {
                    System.out.println("Listan är tom");
            }else{
                    for (int i = 0; i < namnLista.size(); i++) {
                        System.out.println(i+"."+namnLista.get(i)); 
                    }//end for
                }//End if/else
        System.out.println("");
        System.out.println("1.Fyll listan med namn:");
        System.out.println("2. Lägg till ett namn: ");
        System.out.println("3. Lägg till ett namn på en viss plats:");
        System.out.println("4. Se element nummer: ");
        System.out.println("5. Ta bort element nummer: ");
        System.out.println("6. Ta bort ett namn:");
        System.out.println("7.Ta bort alla: ");
        System.out.println("0. Avsluta:");
        
        System.out.println("Välj ett alternativ: ");
        
        val = sc.nextInt();
        
            try {
                
            
        switch (val) {
            case 1:
//                char laggTillNamn='n';
//                do {
//                    System.out.print("Ange namnet: ");
//                    namn = sc.next();
//                    System.out.println("");
//                    namnLista.add(namn);
//                    System.out.print("Vill du lägga till fler namn?(j/n)");
//                    laggTillNamn = sc.next().charAt(0);
//                    System.out.println("");
//                } while (laggTillNamn== 'j'|| laggTillNamn == 'J');
                namnLista.add("kalle");
                namnLista.add("lisa");
                namnLista.add("Anna");
                namnLista.add("Johan");
                namnLista.add("Stina");
                namnLista.add("Pelle");
                namnLista.add("Olle");
                break;
            case 2:
                System.out.println("Ange namnet: ");
                namn = sc.next();
                if(!namn.equals("")){
                    namnLista.add(namn);
                }
                
                break;
            case 3:
                System.out.println("Viss plats");
                plats = sc.nextInt();
                System.out.print("Ange namnet");
                namn = sc.next();
                namnLista.add(plats, namn);
                
                break;
            case 4:
                System.out.println("Ange vilken du vill granska: ");
                plats = sc.nextInt();
                System.out.println("Platsen har namnet: "+ namnLista.get(plats));
                
                break;
            case 5:
                System.out.println("Ange platsen du vill ta bort");
                plats = sc.nextInt();
                namnLista.remove(plats);
                break;
            case 6:
                System.out.println("Ta bort ett namn");
                namn = sc.next();
                boolean hittad = false;
                if (!namn.equals("")) {
                    for (String namnetIListan : namnLista) {
                        if (namnetIListan.equals(namn)) {
                            namnLista.remove(namn);
                            hittad = true;
                        }//End if
                    }//End for
                }//End if
                
                break;
            case 7:
                
                System.out.println("Ta bort listan(j/n)");
                char svar = sc.next().charAt(0);
                if (svar == 'j') {
                    namnLista.clear();
                }else{
                    System.out.println("Du ångrade dig.");
                }
                
                break;
            case 0:
                System.out.println("Goodbye.");
                fortsatt=false;
                break;    
            default:
                throw new AssertionError();
        }//End switch
        } catch (Exception e) {
                System.out.println("Error client side.");
            }//End catch
      }//End while     
    }//end main
}//end class
