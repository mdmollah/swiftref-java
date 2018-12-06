
# IbanDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **String** | The IBAN that was validated |  [optional]
**countryCode** | **String** | The ISO 3166-1 alpha-2 code of the country of the institution/branch. |  [optional]
**checksum** | **String** | The checksum extracted from the IBAN |  [optional]
**bankId** | **String** | The BANK ID extracted from the IBAN. Its structure (bank ID only or bank ID + branch ID) is as defined by the IBAN BIC LENGTH in the IBANSTRUCTURE file. |  [optional]
**branchId** | **String** | Unique and unambiguous identification of a branch of a financial institution. |  [optional]
**accountNumber** | **String** | The remainder of the IBAN including the account number. |  [optional]
**length** | **Integer** | The length of the IBAN |  [optional]
**status** | [**Status**](Status.md) |  |  [optional]



