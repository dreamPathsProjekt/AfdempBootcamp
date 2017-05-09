package library.with.cli;

import java.util.Date;
import java.util.Scanner;

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
    private TransactionQueue transactionQueue;
    
    
    Librarian(Library library){
        this.library=library;
        this.transactionQueue= new TransactionQueue();
        
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
    
    public Author findAuthor(String name){
        return this.library.findAuthor(name);
    }
    
    public void addBook(Book book){
        library.addBook(book);
    }

    public Book findBook(String title){
        return this.library.findBook(title);
    }
    
    public void removeBook(String title){
        this.library.removeBook(title);
    }
    
    public void findMostPopularBook(){
        library.printTheMostPopularBook();
    }
    
    public void rentPhysicalCopy(String booktitle){
        
        try{
        Book temp=this.library.findBook(booktitle);
        
        
        if(temp.isAvailable()){
            Transaction newTrans=new Transaction(temp);
            boolean ok=this.transactionQueue.insertTransaction(newTrans);
            if(ok) {
                temp.rentPhysicalCopy();
                System.out.println("Book "+temp.toString()+" rented at"+newTrans.getRequestDate());
            }
            
        }
        else System.out.println("There are no available copies for rent");
        }catch(NullPointerException e){
            System.out.println("There is no book with that name");
        }
    }
    
    public void executePendingTransactions(){
        Date date=new Date();
        
        //set served date upon execution
        while(!this.transactionQueue.isListEmpty()){
            this.transactionQueue.elementTransaction().setServedDate(date);
            System.out.println("\nExecuting transaction:");
            System.out.println("Transaction [id="+this.transactionQueue.elementTransaction().getId()+
                    " Book="+this.transactionQueue.elementTransaction().getBook().toString()+
                    " Request Date="+this.transactionQueue.elementTransaction().getRequestDate()+"]"+
                    " is being executed on: "+this.transactionQueue.elementTransaction().getServeDate());
            //add to transaction history stack
            
            this.library.getTransactionHistory().pushTransaction(this.transactionQueue.removeTransaction());
            
        }
    }
    
    public void printAllPendingTransactions(){
        this.transactionQueue.printAllTransactions();
    }
    
    public void printTransactionHistory(){
        this.library.printTransactionHistory();
    }
    
    public void showOptions(){
                String back = "y";

        while(back.toLowerCase().equals("y")||back.toLowerCase().equals("yes")){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bootcamp library.\nHow do you want to proceed?");
        System.out.println("1. Show all available books");
        System.out.println("2. Search for a book (by book title)");
        System.out.println("3. Display books from a specific author");
        System.out.println("4. Show me the most popular book");
        System.out.println("5. Add book");
        System.out.println("6. Remove book");
        System.out.println("7. Rent book");
        System.out.println("8. Execute pending transactions");
        System.out.println("9. Show transaction history");
        System.out.println("10. Print pending transactions");
        System.out.println("q. Quit");
        System.out.print("> ");
        boolean loop = true;
        
        while(loop){
        String input = scanner.nextLine();
        Scanner scannerback = new Scanner(System.in);
            switch(input){
                case "1":
                    this.findMeAvailableBooks();
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "2":
                    System.out.print("Please type the title of the book: ");

                    Scanner scanner2= new Scanner(System.in);
                    String title=scanner2.nextLine();

                    this.findMeBook(title);
                    loop=false;
                    
                    System.out.print("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "3":
                    System.out.print("Please type the author's name: ");                    
                    
                    Scanner scanner3= new Scanner(System.in);
                    String author=scanner3.nextLine();

                    this.findMeBooksFromAuthor(author);
                    
                    loop=false;
                    System.out.print("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "4":
                    this.findMostPopularBook();
                    loop=false;
                    System.out.print("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();                    
                    break;
                case "5":
                    System.out.print("Please type the new book name: ");

                    Scanner scanner4= new Scanner(System.in);
                    String bookname=scanner4.nextLine();
                    
                                        
                    System.out.print("How many authors?: ");
                    int authorCounter=Integer.parseInt(scanner4.nextLine());
                    Author [] authorArray= new Author[authorCounter];
                    for(int i=0;i<authorCounter;i++){
                        
                        System.out.print("Please type the author(s): ");

                        
                        String authorname=scanner4.nextLine();
                    
                        if(this.findAuthor(authorname)!=null)                    {
                            authorArray[i]=this.findAuthor(authorname);
                        }
                        else{
                            authorArray[i]=new Author(authorname);
                            
                        }

                    }
                    
                    System.out.print("Please type the new book isbn: ");

                    
                    String isbn=scanner4.nextLine();
                    
                    System.out.print("Number of Physical copies: ");

                    
                    int physicalCopies=Integer.parseInt(scanner4.nextLine());
                    
                    System.out.print("Number of Available copies: ");

                    
                    int availableCopies=Integer.parseInt(scanner4.nextLine());
                    
                    System.out.print("Number of TimesRented: ");

                    
                    int timesRented=Integer.parseInt(scanner4.nextLine());
                    Book newBook= new Book(bookname,authorArray,isbn,physicalCopies,availableCopies,timesRented);
                    this.addBook(newBook);
                    
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "6":
                    System.out.print("Please type the title of the book to remove: ");
                    Scanner scanner5= new Scanner(System.in);
                    String bookTitle=scanner5.nextLine();
                    
                    this.removeBook(bookTitle);
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;    
                case "7":
                    System.out.print("Please type the title of the book to rent: ");
                    Scanner scanner6= new Scanner(System.in);
                    String rentTitle=scanner6.nextLine();
                    
                    this.rentPhysicalCopy(rentTitle);
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "8":
                    this.executePendingTransactions();
                                        
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "9":
                    this.printTransactionHistory();
                    
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "10":
                    this.printAllPendingTransactions();
                    
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;                    
                case "q":
                    System.out.print("Thank you for using the Bootcamp Library");
                    loop=false;
                    
                    back="No";
                    break;
                default:
                    System.out.print("Not a valid input.\nTry again: ");
            }
        }
        }
    }
}
