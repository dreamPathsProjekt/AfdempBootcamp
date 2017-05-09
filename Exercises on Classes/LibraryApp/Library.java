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
    private Book books[];

    Library(Book books[]){
        this.books=books;
    }
    
    public void printAvailableBooks(){
        System.out.println("The following books are available at the library for renting");
        System.out.println("Books available for renting:");
        int count=0;
        for(Book i:books){
            
            if(i.isAvailable()){
                count++;
                System.out.printf("%d. Book [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d] \n",count,i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
            }
        }
    }
    
    public void printBookDetails(String booktitle){
        boolean found=false;
        for(Book i:books){
            if(i.getTitle().equals(booktitle)){
                System.out.printf("Book with title= '%s' found! Details: \nBook [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d]\n",booktitle,i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
                found=true;
            }
            
        }
        if(!found) System.out.printf("Book with title:'%s' not found \n",booktitle);
    }
    
    public void printBooksFromAuthor(String authorname){
        boolean found=false;
        for(Book i:books){
            if (i.getAuthor().toString().equals(authorname))
                System.out.printf("Book with author= '%s' found! Details: \nBook [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d]\n",authorname,i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
                found=true;
        }
        if(!found) System.out.printf("Book with author:'%s' not found \n",authorname);
    }
    
    public void printTheMostPopularBook(){
            int currentmax=books[0].getTimesRented();
            for(int i=1;i<books.length;i++){
                if(books[i].getTimesRented()>currentmax){
                    currentmax=books[i].getTimesRented();
                }
            }
            for(Book i:books){
                if (currentmax==i.getTimesRented()){ //allows to print multiple most popular books(if equal max times rented). 
                    System.out.printf("Most popular book: \n" +
"    Book [title=%s, author=%s, isbn=%s, physicalCopies=%d, availableCopies=%d, timesRented=%d]\n",i.getTitle(),i.getAuthor().toString(),i.getIsbn(),i.getPhysicalCopies(),i.getAvailableCopies(),i.getTimesRented());
                }
            }
        
    }
}

