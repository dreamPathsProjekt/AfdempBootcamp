
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class DataStructs5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
        findMinAndPositions(array);
    }
    
    public static void findMinAndPositions(int [] array){
        String indexes=": ";
        int currentmin=array[0];
        //implementation with 1 for-loop ,use StringBuilder for bigger Arrays.
        for(int i=0;i<array.length;i++){ 
            
            if(array[i]<=currentmin) {
                currentmin=array[i];
                indexes+=i+", ";
            }
        }
        
        System.out.println("Min is " +currentmin+ " in positions"+indexes);
        
    }
    
}
