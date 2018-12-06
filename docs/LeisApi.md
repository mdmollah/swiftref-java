# LeisApi

All URIs are relative to *https://sandbox.swift.com/swiftref-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBicFromLei**](LeisApi.md#getBicFromLei) | **GET** /leis/{lei}/bic | Get the BIC for an LEI


<a name="getBicFromLei"></a>
# **getBicFromLei**
> Bic getBicFromLei(lei, xApiKey)

Get the BIC for an LEI

For a given LEI, you can retrieve the BIC of that LEI.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.LeisApi;


LeisApi apiInstance = new LeisApi();
String lei = "lei_example"; // String | LEI (20-characters) for which the corresponding BIC is requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
try {
    Bic result = apiInstance.getBicFromLei(lei, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeisApi#getBicFromLei");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lei** | **String**| LEI (20-characters) for which the corresponding BIC is requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]

### Return type

[**Bic**](Bic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

