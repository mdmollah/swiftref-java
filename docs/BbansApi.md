# BbansApi

All URIs are relative to *https://sandbox.swift.com/swiftref-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIbanFromBban**](BbansApi.md#getIbanFromBban) | **GET** /bbans/{bban}/iban | Get the IBAN from a BBAN


<a name="getIbanFromBban"></a>
# **getIbanFromBban**
> Iban getIbanFromBban(bban, countryCode, xApiKey)

Get the IBAN from a BBAN

For a given Basic Bank Account Number (BBAN), you can retrieve the corresponding IBAN; you must also provide a country code

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.BbansApi;


BbansApi apiInstance = new BbansApi();
String bban = "bban_example"; // String | BBAN for which the corresponding IBAN is requested
String countryCode = "BE"; // String | The 2-character ISO 3166-1 country code of the country that issued the national ID
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    Iban result = apiInstance.getIbanFromBban(bban, countryCode, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BbansApi#getIbanFromBban");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bban** | **String**| BBAN for which the corresponding IBAN is requested |
 **countryCode** | **String**| The 2-character ISO 3166-1 country code of the country that issued the national ID | [default to BE]
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**Iban**](Iban.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

