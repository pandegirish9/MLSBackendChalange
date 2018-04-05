package backend.chalange.mls.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import backend.chalange.mls.service.BackendService;

/** 
 * The BackendServiceTest class implements an application that simply test the backend service output to the standard output.
 * @version 1.0
 * @author  Girish Pande

 */

@RunWith(Parameterized.class)
public class BackendServiceTest 

{	

	private Integer offsetParameter;
	private String originalStringParameter;
	private String encodedStringParameter;



	public BackendServiceTest(Integer offset, String originalString, String encodedString) {
		super();
		this.offsetParameter = offset;
		this.originalStringParameter = originalString;
		this.encodedStringParameter = encodedString;
	}
	
	// Parameterized collection for input to backend service
	// this collection will help us to test the service with diffrent parameters
	@Parameterized.Parameters
	public static Collection<Object[]>  testParameters() {
		return Arrays.asList(new Object[][] {
			{ 1, "abc","bcd" }, // TestParameters collection format : {offset,originalString,encodedString}
			{ 1, "XYZ","YZA" },
			{ 1, "abZ","bcA" },
			{ 1, "pqr","qrs" },
			{ 1, "pqr","qrs" },
			{ 1, "ZXR","AYS" },
			{ -1, "abc","zab" },
			{ -1, "XYZ","WXY" },
			{ -1, "abZ","zaY" },
			{ -1, "pqr","opq" },
			{ -1, "TYH","SXG" },

		});
	}


	@Test
	public void testBackendService(){

		System.out.println("*****Test Case Start******");
		System.out.println("Parameters from parameterized collection: "+"Offset: "+offsetParameter+"  OrignalString: "+originalStringParameter+" EncodedString: "+encodedStringParameter);
		System.out.println("Orignal string input from  parameterized collection: "+originalStringParameter);


		String encodedStringOutputFromService=BackendService.encodeIncomingString(offsetParameter, originalStringParameter);
		System.out.println("Encoded string output from service layer : "+encodedStringOutputFromService);
		assertEquals(encodedStringOutputFromService, encodedStringParameter);

		System.out.println("*****Test Case end******"+"\n");
	}

}
