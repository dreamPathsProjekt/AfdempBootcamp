/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.with.cli;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dreamPathsProjekt
 */
public class AuthorList {
    private ArrayList<Author> authorList;

    public AuthorList(Author authorsArray[]) {
        this.authorList = new ArrayList<>();
        for(Author i:authorsArray){
            boolean add = this.authorList.add(i);
        }

    }
    
    public boolean ifExists(String author){
        boolean found=false;
        for(Author a:this.authorList){
            if(a.toString().equals(author)) found=true;
        }
        return found;
    }
    
    public Author findAuthor(String name){
        if(this.ifExists(name)){
            for(Author a:this.authorList){
                if(a.toString().equals(name)) return a;
            }
        }return null;
    }
    
    public void addAuthor(Author author){
        if(!this.ifExists(author.toString())) {
            this.authorList.add(author);
            System.out.println("Author "+author.toString()+" succesfully saved.");
        }
        else System.out.println("Author "+author.toString()+" already in list.");
    }
    
    @Override
    public String toString(){
        return this.authorList.toString();
    }
}
