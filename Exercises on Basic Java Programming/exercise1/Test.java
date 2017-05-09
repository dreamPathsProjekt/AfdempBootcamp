/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] numTable  = new int[9];
         int ntlength = numTable.length;
            
        
         for (int i=ntlength-1;i>=0;i--){
             
             for(int y=0;y<ntlength;y++) {
                if(y>=i){
                    numTable[y]=ntlength-i;
                }
                System.out.print(numTable[y]);
             }
             System.out.print("\n");
            
         }
        

    }
    
}
