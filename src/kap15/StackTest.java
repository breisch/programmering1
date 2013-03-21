/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Gustav Breisch
 */
public class StackTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char fortsatt = 'j';
        int val;
        String namn;
        
        
        Stack<String> minStack = new Stack<>();
        
        
        
        while (fortsatt == 'j') {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Lägg till någons tallrik");
            System.out.println("2. Vem ligger först?");
            System.out.println("3. Ta bort något");
            System.out.println("4. avsluta");
            val = sc.nextInt();
            switch (val) {
                case 1:
                    System.out.println("Lägg till ett namn: ");
                    namn = sc.next();
                    minStack.push(namn);
                    System.out.println("Namnet är tillagt.");
                    break;
                case 2:
                    System.out.println("Vad ligger överst?");
                    System.out.println("Överst är " +minStack.peek()+" tallrik");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Tar bort "+ minStack.pop()+" tallrik");
                    minStack.pop();
                    System.out.println(minStack);
                    break;
                case 4:
                    
                    System.out.println("Avslutar programmet...");
                    fortsatt = 'n';
                    break;
            }
        }//End while
        System.out.println("----Avslutat");
        
    }//end main
}//end class
