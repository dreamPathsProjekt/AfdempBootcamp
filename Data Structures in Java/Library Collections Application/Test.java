/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.with.cli;
/**
 *
 * @author dreamPathsProjekt
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    /** Create Random authors */
        Author ruth = new Author("Ruth");
        Author diane = new Author("Diane");
        Author jacqueline = new Author("Jacqueline");
        Author rachel = new Author("Rachel");
        Author joan = new Author("Joan");
        Author theresa = new Author("Theresa");
        Author angela = new Author("Angela");
        Author helen = new Author("Helen");
        Author lisa = new Author("Lisa");

    /** Create books with from the existing authors */
    Book book1 = new Book("Book1",new Author[]{ruth, joan},"368777540-2",10,2,20);
    Book book2 = new Book("Book2",new Author[]{ruth},"963099898-2",10,1,22);
    Book book3 = new Book("Book3",new Author[]{jacqueline, rachel},"005382097-2",10,0,23);
    Book book4 = new Book("Book4",new Author[]{theresa, angela},"538310208-2",10,3,24);
    Book book5 = new Book("Book5",new Author[]{lisa},"562448132-2",10,4,26);
    Book book6 = new Book("Book6",new Author[]{helen},"670364563-2",10,2,21);
    Book book7 = new Book("Book7",new Author[]{diane, jacqueline},"466916869-2",10,5,17);
    Book book8 = new Book("Book8",new Author[]{angela, rachel},"764674973-2",10,0,15);
    Book book9 = new Book("Book9",new Author[]{theresa, jacqueline},"052469721-2",10,6,17);
    Book book10 = new Book("Book10",new Author[]{angela},"609291817-2",10,3,13);
    Book book11 = new Book("Book11",new Author[]{lisa, ruth},"451378028-2",10,8,12);
    Book book12 = new Book("Book12",new Author[]{theresa},"142352773-2",10,6,20);
    Book book13 = new Book("Book13",new Author[]{lisa, rachel},"115135166-2",10,0,20);
    Book book14 = new Book("Book14",new Author[]{helen},"631942468-2",10,3,20);
    Book book15 = new Book("Book15",new Author[]{angela, helen},"323662444-2",10,0,23);
    Book book16 = new Book("Book16",new Author[]{rachel},"121360492-2",10,0,12);
    Book book17 = new Book("Book17",new Author[]{theresa, jacqueline, angela},"391199302-2",10,0,20);
    Book book18 = new Book("Book18",new Author[]{angela,lisa},"549307784-2",10,1,20);
    Book book19 = new Book("Book19",new Author[]{theresa, helen},"368777230-2",10,23,20);
    Book book20 = new Book("Book20",new Author[]{ruth},"793027213-2",10,0,20);

    /** Create the BookList from the books array above **/
    BookList books = new BookList( new Book[]{book1,book2,book3,book4,book5,book6,book7,
            book8,book9,book10,book11,book12,book13,book14,book15,
            book16,book17,book18,book19,book20} );
    /** Assign the book collection to the library */
    Library library = new Library(books);
    /* A librarian undertakes the operation of the library */
    Librarian librarian = new Librarian(library);
    librarian.findMeAvailableBooks();
    librarian.findMeBook("Book3");
    librarian.findMeBooksFromAuthor("Ruth");
    librarian.findMostPopularBook();
    // Not existing cases
    librarian.findMeBook("Book0");
    librarian.findMeBooksFromAuthor("angor");
    // Make some transactions
    librarian.rentPhysicalCopy("Book1");
    librarian.rentPhysicalCopy("Book2");
    librarian.rentPhysicalCopy("Book2"); // no available copies left
    // execute transactions
    librarian.executePendingTransactions();
    librarian.executePendingTransactions(); // no pending trans left
    // print transactions history
    librarian.printTransactionHistory();
    
    librarian.showOptions();
        
    }
    
}
