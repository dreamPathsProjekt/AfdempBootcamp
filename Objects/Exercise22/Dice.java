/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Dice {
    
    public static void roll(){
        
        int count = 0;
        
        while(true){
            
            int dice1 = (int) ((Math.random()*6)+1);
            //System.out.println(dice1); test if dice works.
            int dice2 = (int) ((Math.random()*6)+1);
            
            System.out.printf("%d   %d \n", dice1,dice2);
           
            if(dice1==1&&dice2==1){
                System.out.println("We have a pair of ones");
                System.out.printf("Number of rolls till match: %d", count+1);
                break;
            }
            count++;
        }
    }
}
