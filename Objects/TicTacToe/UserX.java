

/**
 *
 * @author dreamPathsProjekt
 */
public class UserX {
    
    private String coords;
    private final char symbol;
    

    UserX(){
        coords = "A1";
        symbol='X';
        
    }
    
    public void setCoords(String input){

        coords = input;
        System.out.printf("Coordinates %s have been stored \n",coords);
        
    }
    
    public String getCoords(){
        return coords;
    }
    
    public char getSymbol() {
        return symbol;
    }
}
