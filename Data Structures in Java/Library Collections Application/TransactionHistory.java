/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.with.cli;

import java.util.LinkedList;

/**
 *
 * @author dreamPathsProjekt
 */
public class TransactionHistory {
    private LinkedList<Transaction> transactionHistory;
    
        public TransactionHistory(){
        this.transactionHistory = new LinkedList<>();
    }
        
        public void pushTransaction(Transaction t){

        this.transactionHistory.push(t);
        
    }
    
    public Transaction popTransaction(){
        return this.transactionHistory.pop();
    }
    
    public Transaction topTransaction(){
        return this.transactionHistory.peek();
    }

    public boolean isListEmpty(){
        return this.transactionHistory.isEmpty();
    }
    
    
    
    public void printTransactionHistory(){
       if(this.isListEmpty()) System.out.println("There are no archived transactions");
       else{
           System.out.println("\nTransaction History(ordered chronologically - newest first):");
        for(int i=0;i<this.transactionHistory.size();i++){
            System.out.println("Transaction [id="+this.transactionHistory.get(i).getId()+
                    " Book="+this.transactionHistory.get(i).getBook()+
                    " Request Date="+this.transactionHistory.get(i).getRequestDate()+"]"+
                    " was executed on: "+this.transactionHistory.get(i).getServeDate());
        }
       }
    }
    
    
}
