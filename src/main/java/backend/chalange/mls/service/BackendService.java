package backend.chalange.mls.service;

import backend.chalange.mls.service.impl.BackendServiceImpl;

public class BackendService 
{
	
	/**
	 * BackendService class acting as the service class for application
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
		return BackendServiceImpl.encodeIncomingString(offset, original);
	}
	
	
}			





