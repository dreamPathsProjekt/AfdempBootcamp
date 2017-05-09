/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import java.util.Scanner;

/**
 *
 * @author dreamPathsProjekt
 */
public class Exercise9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 9 digit number:");
        String line = scanner.nextLine();

        String[] strs = line.split("");
        int[] intline = new int[9]; //optionally add check user input for array out-of-bounds

        for (int i = 0; i < strs.length; i++) {

            intline[i] = Integer.parseInt(strs[i]);

        }

        for (int i = 0; i < intline.length / 3; i++) { 
            //works for any array where array-size mod 3=0
            if (i != 0) {
                System.out.format("%" + i + "s", ""); //add i number of spaces at the start of newline.
            }
            for (int j = i; j < intline.length; j += 3) {
                //every iteration has a position step of 2 so 2 spaces needed.
                System.out.print(intline[j] + "  "); 
                
            }
            System.out.print("\n");
        }

    }
}
