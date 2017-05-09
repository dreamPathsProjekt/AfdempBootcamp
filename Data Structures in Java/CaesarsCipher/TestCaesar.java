/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class TestCaesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //for right shift use numOfShifts>0, for left shift numOfShifts<0
        String cipher=CaesarsCipher.cipher("The Caesar's cipher works ok.",5);
        System.out.println(cipher);
        String message=CaesarsCipher.decipher(cipher, 5);
        System.out.println(message);
    }
    
}
