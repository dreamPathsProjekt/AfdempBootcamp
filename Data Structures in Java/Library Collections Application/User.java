package library.with.cli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class User {
    private static int count=0;
    private String name;
    private final int id;
    private TransactionHistory transactions;
    private User next;
    
    public User(String name){
        this.next=null;

        count++; //Count the number of users.
        this.id=count;
        this.name=name;
        
    }

    /**
     * @return the next
     */
    public User getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(User next) {
        this.next = next;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public User ifExists(String name){
        
        if (!this.getName().equals(name)) return null;
        else return this;
        
        
    }
}
