# IbansApi

All URIs are relative to *https://sandbox.swift.com/swiftref-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBicFromIban**](IbansApi.md#getBicFromIban) | **GET** /ibans/{iban}/bic | Get the BIC for an IBAN
[**getIbanDetails**](IbansApi.md#getIbanDetails) | **GET** /ibans/{iban} | Get details for an IBAN
[**getIbanValidity**](IbansApi.md#getIbanValidity) | **GET** /ibans/{iban}/validity | Check validity of an IBAN


<a name="getBicFromIban"></a>
# **getBicFromIban**
> IbanBic getBicFromIban(iban, xApiKey)

Get the BIC for an IBAN

For a given IBAN, you can retrieve the BIC of the institution that services the IBAN. This API is compliant with the requirement for BIC from IBAN derivation defined in the Regulation (EU) No 260/2012.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.IbansApi;


IbansApi apiInstance = new IbansApi();
String iban = "iban_example"; // String | IBAN for which the corresponding BIC is requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    IbanBic result = apiInstance.getBicFromIban(iban, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IbansApi#getBicFromIban");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iban** | **String**| IBAN for which the corresponding BIC is requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**IbanBic**](IbanBic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIbanDetails"></a>
# **getIbanDetails**
> IbanDetails getIbanDetails(iban, xApiKey)

Get details for an IBAN

For a given IBAN, you can obtain the components of the IBAN.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.IbansApi;


IbansApi apiInstance = new IbansApi();
String iban = "iban_example"; // String | IBAN for which details are requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    IbanDetails result = apiInstance.getIbanDetails(iban, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IbansApi#getIbanDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iban** | **String**| IBAN for which details are requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**IbanDetails**](IbanDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIbanValidity"></a>
# **getIbanValidity**
> IbanValidity getIbanValidity(iban, xApiKey)

Check validity of an IBAN

You can check whether an IBAN is valid, that is its country code, structure, length, and checksum are valid. It also checks that the bank ID exists and that it is allowed for use in the IBANs. If the bank ID is not allowed, then it is listed in the Exclusion List. This list contains bank IDs that must not be used in IBANs. This validity call allows for very fast, low overhead checking of the validity of an IBAN.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.IbansApi;


IbansApi apiInstance = new IbansApi();
String iban = "iban_example"; // String | IBAN to validate
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    IbanValidity result = apiInstance.getIbanValidity(iban, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IbansApi#getIbanValidity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iban** | **String**| IBAN to validate |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**IbanValidity**](IbanValidity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

