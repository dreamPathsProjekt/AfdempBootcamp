/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructs4;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author dreamPathsProjekt
 */
public class DataStructs4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(palindrome("madam"));
        System.out.println(palindrome("bob"));
        System.out.println(palindrome("nirin"));
        System.out.println(palindrome("john"));
    }
    
    //implement with stack and queue
    public static boolean palindrome(String s){
        Stack<String> stack = new Stack<>();
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(s.length());
        int counter=0;
        
        String[] split = s.split("");
        for(String i:split){
            stack.push(i);
            queue.offer(i);
            
        }
        //testing
        System.out.println(stack);
        System.out.println(queue);
        //
        for(int i=0;i<s.length();i++){
            String pop=stack.pop();
            String poll=queue.poll();
            if(pop.equals(poll)){
                counter++;
                //testing
                System.out.println("found");
            }
        }
        
        if(counter==s.length()) return true;
        return false;
    }
}
