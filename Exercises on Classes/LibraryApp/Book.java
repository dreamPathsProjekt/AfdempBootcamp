/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Book {
    private String title;
    private Author author;
    private final String isbn;
    private int physicalCopies;
    private int availableCopies;
    private int timesRented;
    
    Book(String title,Author author,String isbn,int physicalCopies,int availableCopies,int timesRented){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.physicalCopies=physicalCopies;
        this.availableCopies=availableCopies;
        this.timesRented=timesRented;
    }
    
    public String toString(){
        String bookString=title+","+author.toString()+","+isbn+","+physicalCopies+","+availableCopies+","+timesRented;
        return bookString;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setAuthor(Author author){
        this.author=author;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public int getPhysicalCopies(){
        return physicalCopies;
    }
    
    public void setPhysicalCopies(int copies){
        if (copies>=0){ //no negative values allowed
        physicalCopies=copies;  
        }
        else System.out.println("Please cut the bullshit");
    }
    
    public int getAvailableCopies(){
        return availableCopies;
    }
    public void setAvailableCopies(int copies){
        if(copies>=0) {
            availableCopies=copies;
        }
        else System.out.println("Please cut the bullshit");
    }    
    
    public int getTimesRented(){
        return timesRented;
    }
    
    public void setTimesRented(int times){
        if(times>=0){
            timesRented=times;
        }
        else System.out.println("Please cut the bullshit");
    }
    
    public void rentPhysicalCopy(){
        if(isAvailable()){
            System.out.println("There is an available copy for rent");
            timesRented++;
            this.availableCopies--;
        }
    }
    
    public boolean isAvailable(){
        return (availableCopies>0);
    }
    
    public boolean hasAuthor(String nameToCheck){

        return (nameToCheck.equals(author.toString()));
    }
}
