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
public class TransactionQueue {
    private LinkedList<Transaction> transactionQueue;
    
    public TransactionQueue(){
        this.transactionQueue = new LinkedList<>();
    }
    
    public boolean insertTransaction(Transaction t){

        return this.getTransactionQueue().offer(t);
        
    }
    
    public Transaction removeTransaction(){
        return this.getTransactionQueue().remove();
    }
    
    public Transaction elementTransaction(){
        return this.getTransactionQueue().element();
    }

    /**
     * @return the transactionQueue
     */
    public LinkedList<Transaction> getTransactionQueue() {
        return transactionQueue;
    }
    
    public boolean isListEmpty(){
        return this.transactionQueue.isEmpty();
    }
    
    public void printAllTransactions(){
        if(this.isListEmpty()) System.out.println("There are no pending transactions left");
        else{
            for(Transaction t:this.getTransactionQueue()){
                System.out.println("Transaction [id="+t.getId()+
                    " Book="+t.getBook()+
                    " Request Date="+t.getRequestDate()+"]");
            }
        }
    }
}
