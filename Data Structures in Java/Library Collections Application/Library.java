package library.with.cli;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Library {
    private BookList bookList;
    private TransactionHistory transactionHistory;
    
    Library(BookList bookList){
        
            this.bookList=bookList;
        
            this.transactionHistory= new TransactionHistory();
    }
    
    public Book findBook(String title){
        return this.bookList.findBook(title);
    }
    
    public void removeBook(String title){
        this.bookList.removeBook(title);
    }
    
    public void printAvailableBooks(){
        this.bookList.printAvailableBooks();
    }
    
    public void printBookDetails(String booktitle){
        this.bookList.printBookDetails(booktitle);
    }
    
    public void printBooksFromAuthor(String authorname){
        this.bookList.printBooksFromAuthor(authorname);
    }
    
    public void printTheMostPopularBook(){
        this.bookList.printTheMostPopularBook();
    }
    
    public void printTransactionHistory(){
        this.transactionHistory.printTransactionHistory();
    }
    
    public Author findAuthor(String name){
        return this.bookList.findAuthor(name);
    }
    
    public void addBook(Book book){
        this.bookList.addBook(book);
    }
    /**
     * @return the transactionHistory
     */
    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }
}

