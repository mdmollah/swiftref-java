# BicsApi

All URIs are relative to *https://sandbox.swift.com/swiftref-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBicDetails**](BicsApi.md#getBicDetails) | **GET** /bics/{bic} | Get details of a BIC
[**getBicValidity**](BicsApi.md#getBicValidity) | **GET** /bics/{bic}/validity | Check validity of a BIC
[**getLeiFromBic**](BicsApi.md#getLeiFromBic) | **GET** /bics/{bic}/lei | Get the LEI for a BIC
[**getNationalIdsFromBic**](BicsApi.md#getNationalIdsFromBic) | **GET** /bics/{bic}/national_ids | Get National IDs for a BIC
[**getSepaReachabilityFromBic**](BicsApi.md#getSepaReachabilityFromBic) | **GET** /bics/{bic}/reachability | Validate SEPA reachability of a BIC
[**getSsisFromBic**](BicsApi.md#getSsisFromBic) | **GET** /bics/{bic}/ssis | Get SSIs for a BIC


<a name="getBicDetails"></a>
# **getBicDetails**
> BicDetails getBicDetails(bic, xApiKey)

Get details of a BIC

For a given BIC, you can retrieve the details of that BIC, that is the bank name or business name, and the address.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BicsApi;


BicsApi apiInstance = new BicsApi();
String bic = "bic_example"; // String | BIC (8-characters or 11-characters) for which details are requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    BicDetails result = apiInstance.getBicDetails(bic, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BicsApi#getBicDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bic** | **String**| BIC (8-characters or 11-characters) for which details are requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**BicDetails**](BicDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBicValidity"></a>
# **getBicValidity**
> BicValidity getBicValidity(bic, xApiKey, effectiveDate)

Check validity of a BIC

You can check whether a BIC is correct and valid, that is whether it is published in the BIC Directory; optionally, you can check whether a BIC was valid at a particular date in the past

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BicsApi;


BicsApi apiInstance = new BicsApi();
String bic = "bic_example"; // String | BIC (8-characters or 11-characters) to validate
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
String effectiveDate = "2018-05-07"; // String | A date in YYYY-MM-DD format
try {
    BicValidity result = apiInstance.getBicValidity(bic, xApiKey, effectiveDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BicsApi#getBicValidity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bic** | **String**| BIC (8-characters or 11-characters) to validate |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]
 **effectiveDate** | **String**| A date in YYYY-MM-DD format | [optional] [default to 2018-05-07]

### Return type

[**BicValidity**](BicValidity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLeiFromBic"></a>
# **getLeiFromBic**
> Lei getLeiFromBic(bic, xApiKey)

Get the LEI for a BIC

For a given BIC, you can retrieve the LEI of that BIC.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BicsApi;


BicsApi apiInstance = new BicsApi();
String bic = "bic_example"; // String | BIC (8-characters or 11-characters) for which the corresponding LEI is requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    Lei result = apiInstance.getLeiFromBic(bic, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BicsApi#getLeiFromBic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bic** | **String**| BIC (8-characters or 11-characters) for which the corresponding LEI is requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**Lei**](Lei.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNationalIdsFromBic"></a>
# **getNationalIdsFromBic**
> NationalIds getNationalIdsFromBic(bic, xApiKey)

Get National IDs for a BIC

For a given BIC, you can retrieve the National IDs of that BIC.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BicsApi;


BicsApi apiInstance = new BicsApi();
String bic = "bic_example"; // String | BIC (8-characters or 11-characters) for which the corresponding national IDs are requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    NationalIds result = apiInstance.getNationalIdsFromBic(bic, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BicsApi#getNationalIdsFromBic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bic** | **String**| BIC (8-characters or 11-characters) for which the corresponding national IDs are requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**NationalIds**](NationalIds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSepaReachabilityFromBic"></a>
# **getSepaReachabilityFromBic**
> SepaReachability getSepaReachabilityFromBic(bic, sepaScheme, xApiKey)

Validate SEPA reachability of a BIC

For a given BIC and SEPA payment scheme, you can validate that it can be reached for SEPA payments and return the SEPA channel CSM (Clearing and Settlement System) through which the bank owning the BIC can be reached; the response also returns the adherence BIC that signed the adherence agreement with the EPC and the intermediary institution&#39;s BIC (if applicable and available)

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BicsApi;


BicsApi apiInstance = new BicsApi();
String bic = "bic_example"; // String | BIC (8-characters or 11-characters) for which SEPA reachability is requested
String sepaScheme = "SDD"; // String | SEPA service code
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    SepaReachability result = apiInstance.getSepaReachabilityFromBic(bic, sepaScheme, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BicsApi#getSepaReachabilityFromBic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bic** | **String**| BIC (8-characters or 11-characters) for which SEPA reachability is requested |
 **sepaScheme** | **String**| SEPA service code | [default to SDD]
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**SepaReachability**](SepaReachability.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSsisFromBic"></a>
# **getSsisFromBic**
> Ssis getSsisFromBic(bic, currencyCode, xApiKey, ssiCategory)

Get SSIs for a BIC

For a given BIC, you can retrieve the Standing Settlement Instructions (SSIs) for that BIC, for a given currency, and (optionally) an SSI category (wholesale or retail).

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BicsApi;


BicsApi apiInstance = new BicsApi();
String bic = "bic_example"; // String | BIC (8-characters or 11-characters) for which the corresponding SSIs are requested
String currencyCode = "USD"; // String | A 3-character currency code for which SSI data needs to be retrieved
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
String ssiCategory = "WHLS"; // String | Code that indicates the SSI category for which SSI data needs to be retrieved, that is COPA or WHLS
try {
    Ssis result = apiInstance.getSsisFromBic(bic, currencyCode, xApiKey, ssiCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BicsApi#getSsisFromBic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bic** | **String**| BIC (8-characters or 11-characters) for which the corresponding SSIs are requested |
 **currencyCode** | **String**| A 3-character currency code for which SSI data needs to be retrieved | [default to USD]
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]
 **ssiCategory** | **String**| Code that indicates the SSI category for which SSI data needs to be retrieved, that is COPA or WHLS | [optional] [default to WHLS]

### Return type

[**Ssis**](Ssis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

