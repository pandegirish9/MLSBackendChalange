package backend.chalange.mls.util.validation;

import backend.chalange.mls.util.exception.InvalidInputException;

public class InputValidation 
{
	public void inputParametersValidation(int offset, String original){
		
		
		
     //validate input original input string 
		if ("null".equals(original)  || original.isEmpty() || original.trim().length() < 0){

			try {
				throw new InvalidInputException("Invalid Inputs String."); // throwing custom exception
			} catch (InvalidInputException e) {
				e.printStackTrace();
			}
		}
		
		//validate input offset
		if (!(offset==1 || offset ==-1)){

			try {
				throw new InvalidInputException("Offset is inncorect. Expected is 1 or -1.");  // throwing custom exception
			} catch (InvalidInputException e) {
				e.printStackTrace();
			}
		}

	}
}			





