
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
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputstring="000000000"; //default value to escape compiler error
        boolean chkvalid=false;
        int [] tiN=new int[9];
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tax Identification Number: ");
        while(!chkvalid){
        inputstring=scanner.nextLine();
        //Check whether valid 9 digit TIN
        if(inputstring.length()==9){
            chkvalid=true;
            
        }
        else {
            
            System.out.println("Error:Your input has a different number of digits than expected (9)");
            System.out.print("Enter Tax Identification Number: ");
        }
        }
        String[] strs = inputstring.split("");
        for(int i=0;i<9;i++){
            tiN[i]=Integer.parseInt(strs[i]);
        }
        
        if(checkTIN(tiN)){
            System.out.println("Tax Identification Number valid.");
        }
        else System.out.println("Tax Identification Number not valid.");
    }
    
    public static boolean checkTIN(int [] tiN){
        int checkdigit=tiN[8]; 
        int remainder;
        
        int total=0;
        
        for(int i=0;i<tiN.length-1;i++){
            total+=tiN[i]*(Math.pow(2, (tiN.length-1)-i));
            //for testing -remove prints on final version.
            System.out.println(total);
        }
        remainder=total%11;
        remainder%=10;
        //for testing -remove prints on final version.
        System.out.print(remainder+"\n");
        
        return(remainder==checkdigit);
    }
    
}
