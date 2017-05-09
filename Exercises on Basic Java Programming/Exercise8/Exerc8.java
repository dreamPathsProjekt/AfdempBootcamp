
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Exerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 digit number:");
        String  line = scanner.nextLine();    

        char [] strs = line.toCharArray();
        for(int i=0;i<strs.length;i++){
            if(i%2==0) System.out.print(strs[i]+" ");
            
        }
        System.out.println("\n");
        for(int i=0;i<strs.length;i++){
            if(i%2!=0) System.out.print(" "+strs[i]);
            
        }
        

    }
    
}
