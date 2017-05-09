/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.with.cli;

import java.util.Scanner;

/**
 *
 * @author dreamPathsProjekt
 */
public class LibraryWithCLi {

    
    
    public static void main(String[] args) {
        initLibraryTests initLibrary = new initLibraryTests();
        String back = "y";

        while(back.toLowerCase().equals("y")||back.toLowerCase().equals("yes")){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bootcamp library.\nHow do you want to proceed?");
        System.out.println("1. Show all available books");
        System.out.println("2. Search for a book (by book title)");
        System.out.println("3. Display books from a specific author");
        System.out.println("4. Show me the most popular book");
        System.out.println("q. Quit");
        System.out.print("> ");
        boolean loop = true;
        
        while(loop){
        String input = scanner.nextLine();
        Scanner scannerback = new Scanner(System.in);
            switch(input){
                case "1":
                    initLibrary.theGuyWhoKnowsAlot.findMeAvailableBooks();
                    loop=false;
                    System.out.println("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "2":
                    System.out.print("Please type the title of the book: ");

                    Scanner scanner2= new Scanner(System.in);
                    String title=scanner2.nextLine();

                    initLibrary.theGuyWhoKnowsAlot.findMeBook(title);
                    loop=false;
                    
                    System.out.print("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "3":
                    System.out.print("Please type the author's name: ");                    
                    
                    Scanner scanner3= new Scanner(System.in);
                    String author=scanner3.nextLine();

                    initLibrary.theGuyWhoKnowsAlot.findMeBooksFromAuthor(author);
                    
                    loop=false;
                    System.out.print("Go back to the main menu(Y)or exit(N): ");
                    
                    back=scannerback.nextLine();
                    break;
                case "4":
                    initLibrary.theGuyWhoKnowsAlot.findMostPopularBook();
                    loop=false;
                    System.out.print("Go back to the main menu(Y)or exit(N): ");
                    
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
