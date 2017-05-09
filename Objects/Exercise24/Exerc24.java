
import java.util.Arrays;
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
public class Exerc24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] initArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        Double[] initArrayDouble =new Double[10]; 
        
        for(int i=0;i<10;i++){
            initArrayDouble[i]=(double) initArray[i];
        }
        
        System.out.println(Arrays.toString(initArrayDouble));
        System.out.print("Please define the number of times to shift the Array: ");
        Scanner userscanner = new Scanner(System.in);
        int iterations = userscanner.nextInt();
        

        String shiftedArray = shiftRArray(iterations,initArrayDouble);
        System.out.printf("\nSo the array right-shifted %d times is: \n%s",iterations,shiftedArray);
    }
    
    public static String  shiftRArray(int count, Double[] numarray){
        
        
        for(int iter=0;iter<count;iter++){
            /*One shift to the right routine*/
            double lastNum = numarray[numarray.length-1];
            for (int i=numarray.length-2;i>=0;i--) {
                numarray[i+1]=numarray[i];
  
            }
            numarray[0] = lastNum;
            System.out.println(Arrays.toString(numarray));
        }

        
        return Arrays.toString(numarray);
    }
}
   

