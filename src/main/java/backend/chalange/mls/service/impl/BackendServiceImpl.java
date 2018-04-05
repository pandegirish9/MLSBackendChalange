package backend.chalange.mls.service.impl;


import backend.chalange.mls.service.BackendService;
import backend.chalange.mls.util.StringEncoderUtil;
import backend.chalange.mls.util.validation.InputValidation;


public class BackendServiceImpl extends BackendService
{


	/**
	 * Converts the incoming string to encoded string based on the offset value
	 * 
	 * @author Girish Pande
	 * @version 1.0
	 * 
	 * @param offset
	 *               offset may be 1 or -1 depends on input
	 * @param orignal
	 *               original string which need to be encoded
	 * @return  
	 *                It will return encoded string               
	 */

	public static String encodeIncomingString(int offset, String original) {



		InputValidation inputValidation = new InputValidation();

		// Calling validation service to validate the inputs i.e. offset and original
		inputValidation.inputParametersValidation(offset,original);

		StringBuilder orignalInput = new StringBuilder(original);
		StringBuilder encodedOutput = new StringBuilder();
		
		// Calling utility class to encode the incoming string

		encodedOutput=StringEncoderUtil.generateEncodedString(offset,orignalInput,encodedOutput);

		return encodedOutput.toString();
	}
}






