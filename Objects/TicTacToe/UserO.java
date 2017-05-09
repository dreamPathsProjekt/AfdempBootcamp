

/**
 *
 * @author dreamPathsProjekt
 */
public class UserO {
    
    private String coords;
    private final char symbol;
    
    

    UserO(){
        coords = "A1";
        symbol='O';
        
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
