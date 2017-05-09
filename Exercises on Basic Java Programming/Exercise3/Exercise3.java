
import java.util.Locale;
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
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,solution1,solution2;
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US); //we want to use "." for floating point input
        System.out.println("ax"+(char)178+"+bx+c=0"); //on this console ascii 178:^2.Elsewhere ascii 253:^2
        System.out.print("Please input the a coefficient: ");
        a= scanner.nextDouble();
        System.out.print("\nPlease input the b coefficient: ");
        b= scanner.nextDouble();
        System.out.print("\nPlease input the c coefficient: ");
        c= scanner.nextDouble();
        double discriminant=(Math.pow(b, 2)-4*a*c);
        if(discriminant<0&&a!=0){
            System.out.println("\nThere is no real valued solution for these coefficients");
        }
        else if (a==0){
            System.out.println("\nThe equation is linear and not quadratic");
        }
        else if (discriminant>0&&a!=0){
            solution1=((Math.sqrt(discriminant)-b)/2*a);
            solution2=((-Math.sqrt(discriminant)-b)/2*a);
            System.out.printf("\nThe solutions of the equation are x1=%f and x2=%f",solution1,solution2);
        }
        
    }
    
}
