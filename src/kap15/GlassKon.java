/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Gustav Breisch
 */
public class GlassKon {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        LinkedList<String> namnLista = new LinkedList<>();
        int val=1;
        String namn;
        int plats;
        String forst;
        
        boolean fortsatt=true;
        while (fortsatt) 
        {
            System.out.println("Först i kön: ");    
            if (namnLista.isEmpty()) {
                    System.out.println("Listan är tom");
            }else{
                    for (int i = 0; i < namnLista.size(); i++) {
                        System.out.println(i+"."+namnLista.get(i)); 
                    }//end for
                }//End if/else
        System.out.println("");
        System.out.println("1.Lägg till en person i kön:");
        System.out.println("2. Vem är först?: ");
        System.out.println("3. ta bort person: ");
            System.out.println("4. Gå före i kön: ");
        System.out.println("0. Avsluta:");
        
        System.out.println("Välj ett alternativ: ");
        
        val = sc.nextInt();
        

                
            
        switch (val) {
            case 1:
//                char laggTillNamn='n';
              
                    System.out.print("Ange namnet: ");
                    namn = sc.next();
                    System.out.println("");
//                    namnLista.addLast(namn);
                
                namnLista.add("kalle");
                namnLista.add("lisa");
                namnLista.add("Anna");
                namnLista.add("Johan");
                namnLista.add("Stina");
                namnLista.add("Pelle");
                namnLista.add("Olle");}
        
                break;
            case 2:
                forst = namnLista.getFirst();
                System.out.println(forst+" Är först i kön");
                
                break;
            case 3:
                namnLista.removeFirst();
//                System.out.println("Viss plats");
//                plats = sc.nextInt();
//                System.out.print("Ange namnet");
//                namn = sc.next();
//                namnLista.add(plats, namn);
                
                break;
            case 4:
                
//                System.out.println("Ange vilken du vill granska: ");
//                plats = sc.nextInt();
//                System.out.println("Platsen har namnet: "+ namnLista.get(plats));
//                
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
