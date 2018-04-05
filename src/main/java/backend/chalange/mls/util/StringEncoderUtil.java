package backend.chalange.mls.util;

public class StringEncoderUtil
{
	/**
	 * Converts the incoming string to encoded string based on the offset value
	 * 
	 * @author Girish Pande
	 * @version 1.0
	 * 
	 * @param offset
	 *               offset may be 1 or -1 depends on input
	 * @param orignalStringBuilder
	 *               original string builder which need to be encoded
	  * @param encodedStringBuilder
	 *              encoded outgoing string builder            
	 * @return  
	 *                It will return encoded string               
	 */
	public static StringBuilder generateEncodedString(int offset, StringBuilder orignalInput, StringBuilder encodedOutput) {

		//iterating the incoming string..
		for(int i=0;i<orignalInput.length();i++){
			
			char sb1=orignalInput.charAt(i);

			if(offset==1){
				if (sb1==' '){ // for handling condition like "MNP  PUS" i.e. space between the two string
					String next = " ";
					encodedOutput.append(next);
				}

				else if (sb1=='Z' || sb1=='z'){ // for handling character 'Z' or 'z'
					String next = String.valueOf( (char) (sb1- 25));
					encodedOutput.append(next);
				}
				else{ // for handling all characters except 'Z' or 'z'
					String next = String.valueOf( (char) (sb1 + 1));
					encodedOutput.append(next);
				}

			}
			else if(offset==-1){

				if (sb1==' '){ // for handling condition like "MNP  PUS" i.e. space between the two string
					String next = " ";
					encodedOutput.append(next);
				}

				else if (sb1=='A' || sb1=='a'){ // for handling all characters except 'A' or 'a'
					String next = String.valueOf( (char) (sb1 + 25));
					encodedOutput.append(next);
				}
				else{// for handling all characters except 'A' or 'a'
					String next = String.valueOf( (char) (sb1 - 1));
					encodedOutput.append(next);
				}
			}

		}
		return  encodedOutput;	
	}


}			





