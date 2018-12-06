# NationalIdsApi

All URIs are relative to *https://sandbox.swift.com/swiftref-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBicsFromNationalId**](NationalIdsApi.md#getBicsFromNationalId) | **GET** /national_ids/{national_id}/bics | Get BICs of a National ID
[**getNationalIdDetails**](NationalIdsApi.md#getNationalIdDetails) | **GET** /national_ids/{national_id} | Get details of a National ID
[**getNationalIdValidity**](NationalIdsApi.md#getNationalIdValidity) | **GET** /national_ids/{national_id}/validity | Check the Validity of a National ID


<a name="getBicsFromNationalId"></a>
# **getBicsFromNationalId**
> Bics getBicsFromNationalId(nationalId, xApiKey, countryCode, scheme)

Get BICs of a National ID

For a given national ID, you can retrieve the BIC or the BICs of that national ID; you need to provide the national ID, and either a country code, or an indication to which scheme this national ID belongs

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.NationalIdsApi;


NationalIdsApi apiInstance = new NationalIdsApi();
String nationalId = "nationalId_example"; // String | National ID for which the corresponding BICs are requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
String countryCode = "BE"; // String | The 2-character ISO 3166-1 country code of the country that issued the National ID (mandatory, when scheme parameter is not provided)
String scheme = "scheme_example"; // String | The scheme under which the national ID is defined (mandatory, when country_code parameter is not provided)
try {
    Bics result = apiInstance.getBicsFromNationalId(nationalId, xApiKey, countryCode, scheme);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NationalIdsApi#getBicsFromNationalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nationalId** | **String**| National ID for which the corresponding BICs are requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]
 **countryCode** | **String**| The 2-character ISO 3166-1 country code of the country that issued the National ID (mandatory, when scheme parameter is not provided) | [optional] [default to BE]
 **scheme** | **String**| The scheme under which the national ID is defined (mandatory, when country_code parameter is not provided) | [optional]

### Return type

[**Bics**](Bics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNationalIdDetails"></a>
# **getNationalIdDetails**
> NationalIdsDetails getNationalIdDetails(nationalId, xApiKey, countryCode, scheme)

Get details of a National ID

For a given National ID, you can retrieve the details of that National ID, that is the bank name or business name, and the address. You must provide either a country code, or an indication to which scheme the National ID belongs.

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.NationalIdsApi;


NationalIdsApi apiInstance = new NationalIdsApi();
String nationalId = "nationalId_example"; // String | National ID for which details are requested
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
String countryCode = "BE"; // String | The 2-character ISO 3166-1 country code of the country that issued the National ID (mandatory, when scheme parameter is not provided)
String scheme = "ABB-BVB"; // String | The scheme under which the national ID is defined (mandatory, when country_code parameter is not provided)
try {
    NationalIdsDetails result = apiInstance.getNationalIdDetails(nationalId, xApiKey, countryCode, scheme);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NationalIdsApi#getNationalIdDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nationalId** | **String**| National ID for which details are requested |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]
 **countryCode** | **String**| The 2-character ISO 3166-1 country code of the country that issued the National ID (mandatory, when scheme parameter is not provided) | [optional] [default to BE]
 **scheme** | **String**| The scheme under which the national ID is defined (mandatory, when country_code parameter is not provided) | [optional] [default to ABB-BVB]

### Return type

[**NationalIdsDetails**](NationalIdsDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNationalIdValidity"></a>
# **getNationalIdValidity**
> NationalIdValidity getNationalIdValidity(nationalId, xApiKey, countryCode, scheme)

Check the Validity of a National ID

With this API call, you can check whether a national ID is correct and valid; you need to provide the national ID, and either a country code, or an indication to which scheme this national ID belongs

### Example
```java
// Import classes:
//import com.swift.swiftref.java_sdk.ApiException;
//import com.swift.swiftref.java_sdk.api.NationalIdsApi;


NationalIdsApi apiInstance = new NationalIdsApi();
String nationalId = "nationalId_example"; // String | National ID to validate
String xApiKey = "ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n"; // String | An API key given to your application to authenticate against the sandbox URL
String countryCode = "BE"; // String | The 2-character ISO 3166-1 country code of the country that issued the National ID (mandatory, when scheme parameter is not provided)
String scheme = "scheme_example"; // String | The scheme under which the national ID is defined (mandatory, when country_code parameter is not provided)
try {
    NationalIdValidity result = apiInstance.getNationalIdValidity(nationalId, xApiKey, countryCode, scheme);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NationalIdsApi#getNationalIdValidity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nationalId** | **String**| National ID to validate |
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to ZGyXZxU6Zmro1YZfJnJyh77IyOkKbb8n]
 **countryCode** | **String**| The 2-character ISO 3166-1 country code of the country that issued the National ID (mandatory, when scheme parameter is not provided) | [optional] [default to BE]
 **scheme** | **String**| The scheme under which the national ID is defined (mandatory, when country_code parameter is not provided) | [optional]

### Return type

[**NationalIdValidity**](NationalIdValidity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

