
package com.swift.swiftref.java_sdk.example;

import org.junit.Ignore;
import org.junit.Test;

import com.swift.swiftref.java_sdk.ApiException;
import com.swift.swiftref.java_sdk.api.IbansApi;
import com.swift.swiftref.java_sdk.model.IbanBic;
import com.swift.swiftref.java_sdk.model.IbanDetails;
import com.swift.swiftref.java_sdk.model.IbanValidity;

/**
 * API tests for IbansApi
 */
@Ignore
public class IbansApiTest {

	private final IbansApi api = new IbansApi();

	/**
	 * Get the BIC for an IBAN
	 *
	 * For a given IBAN, you can retrieve the BIC of the institution that services
	 * the IBAN. This API is compliant with the requirement for BIC from IBAN
	 * derivation defined in the Regulation (EU) No 260/2012.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getBicFromIbanTest() throws ApiException {
		String iban = "Example_iban";
		String xApiKey = "Example_xApiKey";
		IbanBic response = api.getBicFromIban(iban, xApiKey);

		System.out.println(response.toString());
	}

	/**
	 * Get details for an IBAN
	 *
	 * For a given IBAN, you can obtain the components of the IBAN.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getIbanDetailsTest() throws ApiException {
		String iban = "Example_iban";
		String xApiKey = "Example_xApiKey";
		IbanDetails response = api.getIbanDetails(iban, xApiKey);

		System.out.println(response.toString());
	}

	/**
	 * Check validity of an IBAN
	 *
	 * You can check whether an IBAN is valid, that is its country code, structure,
	 * length, and checksum are valid. It also checks that the bank ID exists and
	 * that it is allowed for use in the IBANs. If the bank ID is not allowed, then
	 * it is listed in the Exclusion List. This list contains bank IDs that must not
	 * be used in IBANs. This validity call allows for very fast, low overhead
	 * checking of the validity of an IBAN.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getIbanValidityTest() throws ApiException {
		String iban = "Example_xApiKey";
		String xApiKey = "Example_xApiKey";
		IbanValidity response = api.getIbanValidity(iban, xApiKey);

		System.out.println(response.toString());
	}

}
