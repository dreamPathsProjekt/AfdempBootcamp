
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
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputstring; 
        String [] strs = null;
        int countParity =0; //number of 1s in the 8-bit binary number
        
        boolean chkvalid=false;
        
        
        
        System.out.print("Enter 8-bit binary number: ");
        Scanner scanner = new Scanner(System.in);

        while(!chkvalid){
           inputstring=scanner.nextLine();
           

           //Check if valid 8-digit binary by checking size and regex pattern match only for 1 or 0.
           
            if(inputstring.length()==8&&inputstring.matches("[01]+")){
                chkvalid=true;
                strs = inputstring.split(""); 
            }
            else {
                System.out.println("Your input is not an 8-bit binary number. "); 
                System.out.print("Enter 8-bit binary number: ");      
            }
        }
        
        //implement even parity bit check
        for(String i:strs){
          if(i.equals("1"))  countParity++;          
        }
        if(countParity%2==0){
            System.out.println("Parity check OK.");
        }
        else System.out.println("Parity check not OK.");
        
    }
    
}
