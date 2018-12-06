
package com.swift.swiftref.java_sdk.example;

import org.junit.Ignore;
import org.junit.Test;

import com.swift.swiftref.java_sdk.ApiException;
import com.swift.swiftref.java_sdk.api.BbansApi;
import com.swift.swiftref.java_sdk.model.Iban;

/**
 * API tests for BbansApi
 */
@Ignore
public class BbansApiTest {

	private final BbansApi api = new BbansApi();

	/**
	 * Get the IBAN from a BBAN
	 *
	 * For a given Basic Bank Account Number (BBAN), you can retrieve the
	 * corresponding IBAN; you must also provide a country code
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getIbanFromBbanTest() throws ApiException {
		String bban = "Example_bban";
		String countryCode = "Example_Country_Code";
		String xApiKey = "Example_XAPIKey";
		Iban response = api.getIbanFromBban(bban, countryCode, xApiKey);
		System.out.println(response.toString());

		// TODO: test validations
	}

}
