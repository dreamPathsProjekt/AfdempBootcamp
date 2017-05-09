/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.with.cli;

import java.util.Date;

/**
 *
 * @author dreamPathsProjekt
 */
public class Transaction {
    private Book book;
    private Date requestDate;
    private Date serveDate;
    private static int countTransactions=0;
    private final int id;
    

    public Transaction(Book book) {
        countTransactions++;
        this.id=countTransactions;
        this.book=book;

        this.requestDate=new Date();
        //this.serveDate=new Date();
    }
    
    public Transaction(Book book,Date requestDate){
        countTransactions++;
        this.id=countTransactions;
        this.book=book;

        this.requestDate=requestDate;
        //this.serveDate=new Date(serveDate.getTime());
    }
    /*
    public Transaction(Book book,Date requestDate,Date serveDate){
        countTransactions++;
        this.id=countTransactions;
        this.book=book;

        this.requestDate=new Date(requestDate.getTime());
        this.serveDate=new Date(serveDate.getTime());
    }
    */
    public void setServedDate(Date date){
        this.serveDate=date;
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * @return the requestDate
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * @return the serveDate
     */
    public Date getServeDate() {
        return serveDate;
    }

    /**
     * @return the countTransactions
     */
    public static int getCountTransactions() {
        return countTransactions;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    
}
