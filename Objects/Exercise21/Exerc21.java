/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Exerc21 {

    public static void main(String[] args) {
        int test1=bootCamp(25,91);
        int test2=bootCamp(91,25);
        System.out.println(test1);
        System.out.println(test2);
    }
    
    public static int bootCamp(int number1, int number2) {
        if(number1<number2){
            int absolute = Math.abs(number2-number1);
            int sqrt = (int) Math.sqrt(absolute);
            return sqrt;
        }
        
        return (number1+number2);
    }
}
