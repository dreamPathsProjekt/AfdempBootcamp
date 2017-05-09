/**
 *
 * @author dreamPathsProjekt
 */
public class Bootcamp {

	public static void welcome(double input) throws DigitException, AnotherDigitException{
		if(input>25) throw new DigitException();
		else throw new AnotherDigitException();
	}
	
	public static int bye(){
		int errCode = 0;
		try{
			Bootcamp.welcome(299.7);
		}
		catch(DigitException digitex){
			digitex.printExcMessage();;
			 errCode=605;
		}
		catch(AnotherDigitException andigitex){
			andigitex.printStackTrace();
			errCode=230;
		}
		return errCode;
	}
	
}
