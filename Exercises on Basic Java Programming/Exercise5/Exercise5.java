
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
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pronic numbers: ");
        int count=scanner.nextInt();
        int [] pronic =new int[count];
        
        for(int i=1;i<=count;i++){
            pronic[i-1]=i*(i+1);
            System.out.printf(" %d",pronic[i-1]);
        }
        
    }
    
}
