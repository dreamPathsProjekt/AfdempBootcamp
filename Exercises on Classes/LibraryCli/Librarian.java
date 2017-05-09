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
public class Librarian {
    private Library library;
    
    Librarian(Library library){
        this.library=library;
    }
    
    public void findMeBooksFromAuthor(String authorname){
        library.printBooksFromAuthor(authorname);
    }
    
    public void findMeAvailableBooks(){
        library.printAvailableBooks();
    }
    
    public void findMeBook(String booktitle){
        library.printBookDetails(booktitle);
    }
    
    public void findMostPopularBook(){
        library.printTheMostPopularBook();
    }
}
