/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author dreamPathsProjekt
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] banknotes = {50, 20, 10, 5};
        int[] coins = {2, 1};
        int total = 0;
        for (int x : banknotes) {
            System.out.printf("Enter number of %d euro banknotes:", x);

            switch (x) {
                case 50:
                    total += scanner.nextInt() * 50;
                    break;

                case 20:
                    total += scanner.nextInt() * 20;
                    break;

                case 10:
                    total += scanner.nextInt() * 10;
                    break;

                case 5:
                    total += scanner.nextInt() * 5;
                    break;

            }

        }
        for (int x : coins) {
            System.out.printf("Enter number of %d euro coins:", x);

            switch (x) {
                case 2:
                    total += scanner.nextInt() * 2;
                    break;

                case 1:
                    total += scanner.nextInt();
                    break;
            }

        }
        System.out.print("You have " + total + " euros.");
    }

}
