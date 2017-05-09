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
public class UserList {
    private User head;
    
    public UserList(){
      this.head=null;  
    }
    public User searchUser(String name){
        
        if(this.head==null) return null;
        
        else{
            User currentUser=this.head;
            while(currentUser.getNext()!=null){
                currentUser=currentUser.getNext();
            }
            return currentUser.ifExists(name);
        }
    }
    public void addUser(User user){
        if(this.searchUser(user.getName())!=null){System.out.println("User "+user.getName()+" already exists.");}
        else{
            if(this.head==null) this.head=user;
            else {
                User currentUser=this.head;
            
                while(currentUser.getNext()!=null){
                currentUser=currentUser.getNext();
                }
                currentUser.setNext(user);
            }
        }
    }
    
    
}
