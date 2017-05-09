/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.with.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


/**
 *
 * @author dreamPathsProjekt
 */
public class BookList {
        private LinkedList<Book> bookList;

    public BookList(Book booksArray[]) {
        this.bookList = new LinkedList<>();
        
        this.bookList.addAll(Arrays.asList(booksArray));
        
    }
    
    public boolean exists(String title){
        return this.bookList.toString().contains(title); 
    }
    
    public void addBook(Book newBook){
        if(!this.exists(newBook.getTitle())){
            this.bookList.add(newBook);
            System.out.println("Book "+newBook.toString()+" succesfully saved.");
        }
        else System.out.println("Book "+newBook.toString()+" already in list.");
    }
    
    public void removeBook(String title){

            Book remBook = findBook(title);
            if(remBook!=null){
                this.bookList.remove(remBook);
                System.out.println("Book "+remBook.getTitle()+" succesfully removed.");
            }
        
            else System.out.println("Book "+title+" not in list."); 
    }
    
    public Book findBook(String title){

        if(this.exists(title)){
           for(Book temp:this.bookList){
               if(temp.getTitle().equals(title)) {
                   return temp;
               }
           }

        }
        return null;
    }

    public void printAvailableBooks(){
        System.out.println("The following books are available at the library for renting");
        System.out.println("Books available for renting:");
        int count=0;
        for(Book i:this.bookList){
            
            if(i.isAvailable()){
                count++;
                System.out.printf("%d. Book [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d] \n",count,i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
            }
        }
    }
    
    public void printBookDetails(String booktitle){
        
            Book foundBook=this.findBook(booktitle);
            if(foundBook!=null){
                System.out.printf("Book with title= '%s' found! Details: \nBook [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d]\n",booktitle,foundBook.getTitle(),foundBook.getAuthor().toString(),foundBook.getIsbn(),foundBook.getPhysicalCopies(),foundBook.getAvailableCopies(),foundBook.getTimesRented());
                
            }
            else System.out.printf("Book with title:'%s' not found \n",booktitle);
    }
    
    public void printBooksFromAuthor(String authorname){
        boolean found=false;
        for(Book i:this.bookList){
            if (i.hasAuthor(authorname)){
                System.out.printf("Books with author= '%s' found! Details: \nBook [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d]\n",authorname,i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
                found=true;
            }
        }
        if(!found) System.out.printf("Book with author:'%s' not found \n",authorname);
    }
    
    public void printTheMostPopularBook(){
        
        int currentmax=this.bookList.get(0).getTimesRented();
        for(int i=0;i<this.bookList.size();i++){
            if(this.bookList.get(i).getTimesRented()>currentmax){
                currentmax=this.bookList.get(i).getTimesRented();
            }
        }
        for(Book i:this.bookList){
                if (currentmax==i.getTimesRented()){ //allows to print multiple most popular books(if equal max times rented). 
                    System.out.printf("Most popular book: \n" +
                "    Book [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d]\n",i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
                }
            }
        
    }
    
    public Author findAuthor(String name){
        for(Book b:this.bookList){
            if(b.hasAuthor(name)){
                return b.findAuthor(name);
            }
        }
        return null;
    }
}
