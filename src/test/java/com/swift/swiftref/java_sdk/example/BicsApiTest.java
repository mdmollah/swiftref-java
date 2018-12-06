
package com.swift.swiftref.java_sdk.example;

import org.junit.Ignore;
import org.junit.Test;

import com.swift.swiftref.java_sdk.ApiException;
import com.swift.swiftref.java_sdk.api.BicsApi;
import com.swift.swiftref.java_sdk.model.BicDetails;
import com.swift.swiftref.java_sdk.model.BicValidity;
import com.swift.swiftref.java_sdk.model.Lei;
import com.swift.swiftref.java_sdk.model.NationalIds;
import com.swift.swiftref.java_sdk.model.SepaReachability;
import com.swift.swiftref.java_sdk.model.Ssis;

/**
 * API tests for BicsApi
 */
@Ignore
public class BicsApiTest {

    private final BicsApi api = new BicsApi();

    
    /**
     * Get details of a BIC
     *
     * For a given BIC, you can retrieve the details of that BIC, that is the bank name or business name, and the address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBicDetailsTest() throws ApiException {
    	String bic = "Example_bic";
        String xApiKey = "Example_xApiKey";
        BicDetails response = api.getBicDetails(bic, xApiKey);

        System.out.println(response.toString());
    }
    
    /**
     * Check validity of a BIC
     *
     * You can check whether a BIC is correct and valid, that is whether it is published in the BIC Directory; optionally, you can check whether a BIC was valid at a particular date in the past
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBicValidityTest() throws ApiException {
    	String bic = "Example_bic";
        String xApiKey = "Example_xApiKey";
        String effectiveDate = "Example_effectiveDate";
        BicValidity response = api.getBicValidity(bic, xApiKey, effectiveDate);
        System.out.println(response.toString());
       
    }
    
    /**
     * Get the LEI for a BIC
     *
     * For a given BIC, you can retrieve the LEI of that BIC.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeiFromBicTest() throws ApiException {
    	String bic = "Example_bic";
        String xApiKey = "Example_xApiKey";
        Lei response = api.getLeiFromBic(bic, xApiKey);
        System.out.println(response.toString());
       
    }
    
    /**
     * Get National IDs for a BIC
     *
     * For a given BIC, you can retrieve the National IDs of that BIC.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNationalIdsFromBicTest() throws ApiException {
    	String bic = "Example_bic";
        String xApiKey = "Example_xApiKey";
        NationalIds response = api.getNationalIdsFromBic(bic, xApiKey);
        System.out.println(response.toString());
    }
    
    /**
     * Validate SEPA reachability of a BIC
     *
     * For a given BIC and SEPA payment scheme, you can validate that it can be reached for SEPA payments and return the SEPA channel CSM (Clearing and Settlement System) through which the bank owning the BIC can be reached; the response also returns the adherence BIC that signed the adherence agreement with the EPC and the intermediary institution&#39;s BIC (if applicable and available)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSepaReachabilityFromBicTest() throws ApiException {
    	String bic = "Example_bic";
        String xApiKey = "Example_xApiKey";
        String sepaScheme = "Example_sepaScheme";
        SepaReachability response = api.getSepaReachabilityFromBic(bic, sepaScheme, xApiKey);
        System.out.println(response.toString());
    }
    
    /**
     * Get SSIs for a BIC
     *
     * For a given BIC, you can retrieve the Standing Settlement Instructions (SSIs) for that BIC, for a given currency, and (optionally) an SSI category (wholesale or retail).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSsisFromBicTest() throws ApiException {
    	String bic = "Example_bic";
        String xApiKey = "Example_xApiKey";
        String currencyCode = "Example_currencyCode";
        String ssiCategory = "Example_ssiCategory";
        Ssis response = api.getSsisFromBic(bic, currencyCode, xApiKey, ssiCategory);
        System.out.println(response.toString());
    }
    
}
