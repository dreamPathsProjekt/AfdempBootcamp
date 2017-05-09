/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class CaesarsCipher {
    public static String cipher(String message, int numOfShifts) {
        String cipherText;
        char[] messageArray=message.toCharArray();
        int[] asciiArray = new int[messageArray.length];
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<messageArray.length;i++){
            asciiArray[i]= (int) messageArray[i];
            //System.out.print(" | "+messageArray[i] +" : "+asciiArray[i]);
            
            builder.append((char)(asciiArray[i]+numOfShifts));
        }
        cipherText=builder.toString();
        
        return cipherText;
    }
    
    public static String decipher(String cipherText, int numOfShifts){
        String message;
        char[] cipherArray=cipherText.toCharArray();
        int[] asciiArray = new int[cipherArray.length];
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<cipherArray.length;i++){
            asciiArray[i]= (int) cipherArray[i];
            //System.out.print(" | "+cipherArray[i] +" : "+asciiArray[i]);
            
            builder.append((char)(asciiArray[i]-numOfShifts));
        }
        message=builder.toString();
        
        return message;
    }
}
