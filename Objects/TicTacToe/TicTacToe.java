
import java.util.Arrays;
import java.util.Scanner;


//to show diff
/**
 *
 * @author dreamPathsProjekt
 */
public class TicTacToe {
    public static boolean flag=false;
    public static boolean valid=false;
    
    public static void main(String[] args) {   
        UserX userx = new UserX();
        UserO usero = new UserO();
        
        String coordinates = "N/A";
        
        
        String win="no";
        boolean draw=false;
        
        System.out.println("Greetings, shall we play a game? \n A strange game. The only winning move is not to play. \n How about a nice game of Tic Tac Toe? ");
        //initialize board
        char [][] board = new char [4][4];
        
        board = initBoard(board);
        //draw coordinates index around board
        board=drawFrame(board);
        //print board
        drawFunction(board);
        //input loop
        while(win.equals("no")||!draw){
        /*input loop for user x*/
        
            flag = false;
            valid =false;
            while(((!valid)||(!flag))&&win.equals("no")){ //Repeat input if input invalid or point taken on board.
        System.out.println("UserX input your coordinates\n(Not Case Sensitive E.g. A1,a1,b2 etc.): ");
        Scanner charscanner = new Scanner(System.in);
        String coordinput=charscanner.nextLine();

        /*Check for illegal input ,set flag=1 when valid input*/
        String [] allowableChars = new String[]{"a1","a2","a3","b1","b2","b3","c1","c2","c3"};
        coordinates = checkInput(coordinput,allowableChars);
            
        userx.setCoords(coordinates);
        /*Check if empty and store coordinates in board*/
        
        if(checkEmpty(board,userx.getCoords())){
            
            board=storeCoords(userx.getCoords(),board,userx.getSymbol());
            valid = true;
        }
        else {
            
            System.out.printf("UserX type another input. %s is full \n",coordinates);
        }
        }
        
        drawFunction(board);
        win=checkWinConditions(board); 

        if(checkDrawConditions(board)){
            draw=true;
            System.out.println("This Game ended in a Draw");
            break;
        }        

        if(win.equals("winX")) {
            System.out.println("You won User X!");
            break;
            
        }
        else if(win.equals("winO")) {
            System.out.println("You won User O!");
            break;
            
        }
        

        
        
        
        
        /*input loop for user o*/
        
            flag = false;
            valid =false;
            while(((!valid)||(!flag))&&win.equals("no")){//Repeat input if input invalid or point taken on board.
        System.out.println("UserO input your coordinates\n(Not Case Sensitive E.g. A1,a1,b2 etc.): ");
        Scanner charscanner = new Scanner(System.in);
        String coordinput=charscanner.nextLine();

        /*Check for illegal input ,set flag=1 when valid input*/
        String [] allowableChars = new String[]{"a1","a2","a3","b1","b2","b3","c1","c2","c3"};
        coordinates = checkInput(coordinput,allowableChars);
            
        usero.setCoords(coordinates);
        /*Check if empty and store coordinates in board*/
        
        if(checkEmpty(board,usero.getCoords())){
            
            board=storeCoords(usero.getCoords(),board,usero.getSymbol());
            valid = true;
        }
        else {
            
            System.out.printf("UserO type another input. %s is full \n",coordinates);
        }
        
            }
        
        drawFunction(board);
        win=checkWinConditions(board);

        if(checkDrawConditions(board)){
            draw=true;
            System.out.println("This Game ended in a Draw");
            break;
        }
        System.out.printf("%b %s \n",draw,win);
        
        if(win.equals("winX")) {
            System.out.println("You won User X!");
            break;
            
        }
        else if(win.equals("winO")) {
            System.out.println("You won User O!");
            break;
            
        }


      
        }         
    }
   
    public static void drawFunction(char[][] inboard){
        for(int i=0;i<4;i++){
            System.out.println(Arrays.toString(inboard[i]));
        }
    }
    
    public static char[][] drawFrame(char[][] board){
        for(int i =0;i<4;i++){
            switch(i){
                case 0:
                    board[0][i]='*';
                    break;
                case 1:
                    board[0][i]='A';
                    break;
                case 2:
                    board[0][i]='B';
                    break;
                case 3:
                    board[0][i]='C';
                    break;
            }
        }
        for(int i =0;i<4;i++){
            switch(i){
                case 0:
                    board[0][i]='*';
                    break;

                case 1:
                    board[i][0]='1';
                    break;
                case 2:
                    board[i][0]='2';
                    break;
                case 3:
                    board[i][0]='3';
                    break;
            }
        }
        
        return board;
    }
    
    public static char[][] initBoard(char board[][]){
        for(int i=0;i<board[0].length;i++){
            for(int y=0;y<board[0].length;y++){
                board[i][y]='-';
            }
        }
        return board;
    }
    
    public static String checkInput(String input,String[] allowableChars){
        
        String coordinates="N/A";
        
            
        
            for(String i: allowableChars){
                    if(input.toLowerCase().contains(i)){
                      coordinates = i;
                      flag = true;
                      //System.out.println(coordinates);                      
                    }
            }        
            if (!flag) {
                System.out.println("You didn't type any valid coordinates dummy!Type again: ");
            }
        
        return coordinates;
    }
    
    public static boolean checkEmpty(char [][] board,String coordinates){
        boolean empty=false;
        switch(coordinates.toLowerCase()) {
            case "a1":
                if (board[1][1]=='-') empty=true;
                break;
            case "a2":
                if (board[2][1]=='-') empty=true;
                break;    
            case "a3":
                if (board[3][1]=='-') empty=true;
                break;
            case "b1":
                if (board[1][2]=='-') empty=true;
                break;
            case "b2":
                if (board[2][2]=='-') empty=true;
                break;
            case "b3":
                if (board[3][2]=='-') empty=true;
                break;
            case "c1":
                if (board[1][3]=='-') empty=true;
                break;
            case "c2":
                if (board[2][3]=='-') empty=true;
                break;       
            case "c3":
                if (board[3][3]=='-') empty=true;
                break;                
        }
        return empty;
    }
    public static char[][] storeCoords(String coordinates,char[][] board,char symbol){
        /*on storing symbols X or Y add a magic number*/
        switch(coordinates.toLowerCase()) {
            case "a1":
                board[1][1]=symbol;
                
                break;
            case "a2":
                board[2][1]=symbol;
                
                break;    
            case "a3":
                board[3][1]=symbol;
                               
                break;
            case "b1":
                board[1][2]=symbol;
                               
                break;
            case "b2":
                board[2][2]=symbol;
                
                break;
            case "b3":
                board[3][2]=symbol;
                
                break;
            case "c1":
                board[1][3]=symbol;
                
                break;
            case "c2":
                board[2][3]=symbol;
                
                break;       
            case "c3":
                board[3][3]=symbol;
                
                break; 
        }
        return board;
    }
    
    public static String checkWinConditions(char[][] board){
        String cond = "no";
        int [][] counterX =new int[4][4];
        int [][] counterO =new int[4][4];
        /*since the board is 3x3 we can use magic squares representation.
        A win occurs when row,column or diagonal adds up to 15*/
        if (board[1][1]=='X'){
            counterX[1][1]=8;            
        }
        if(board[1][1]=='O'){
            counterO[1][1]=8;
        }
        if(board[1][2]=='X'){
            counterX[1][2]=1;
        }
        if(board[1][2]=='O'){
            counterO[1][2]=1;
        }
        if(board[1][3]=='X'){
            counterX[1][3]=6;
        }
        if(board[1][3]=='O'){
            counterO[1][3]=6;
        }
        if(board[2][1]=='X'){
            counterX[2][1]=3;
        }
        if(board[2][1]=='O'){
            counterO[2][1]=3;
        }
        if(board[2][2]=='X'){
            counterX[2][2]=5;
        }
        if(board[2][2]=='O'){
            counterO[2][2]=5;
        }
        if(board[2][3]=='X'){
            counterX[2][3]=7;
        }
        if(board[2][3]=='O'){
            counterO[2][3]=7;
        }
        if(board[3][1]=='X'){
            counterX[3][1]=4;
        }
        if(board[3][1]=='O'){
            counterO[3][1]=4;
        }
        if(board[3][2]=='X'){
            counterX[3][2]=9;
        }
        if(board[3][2]=='O'){
            counterO[3][2]=9;
        }
        if(board[3][3]=='X'){
            counterX[3][3]=2;
        }
        if(board[3][3]=='O'){
            counterO[3][3]=2;
        }
        
        for(int i=1;i<counterX[0].length;i++){
            if(counterX[i][1]+counterX[i][2]+counterX[i][3]==15
                    ||counterX[1][i]+counterX[2][i]+counterX[3][i]==15
                    ||counterX[1][1]+counterX[2][2]+counterX[3][3]==15
                    ||counterX[1][3]+counterX[2][2]+counterX[3][1]==15){
                cond="winX";
            }
            else if(counterO[i][1]+counterO[i][2]+counterO[i][3]==15
                    ||counterO[1][i]+counterO[2][i]+counterO[3][i]==15
                    ||counterO[1][1]+counterO[2][2]+counterO[3][3]==15
                    ||counterO[1][3]+counterO[2][2]+counterO[3][1]==15){
                cond="winO";
            }
        }
        
        return cond;
    }
    public static boolean checkDrawConditions(char[][] board){
        boolean draw=false;
        int count=0;
        for (int i=1;i<board[0].length;i++){
            for(int j=1;j<board[0].length;j++){
                if(board[i][j]!='-')
                    count++;
                    
            }
        }
        /*check if board is full*/
        if(count==9) draw=true;
        return draw;
    }
}
