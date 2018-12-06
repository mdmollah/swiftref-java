
# BicDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bic** | **String** | The BIC of the institution on which more information is requested |  [optional]
**institutionName** | **String** | Name by which a party is known and which is usually used to identify that party |  [optional]
**branchInformation** | **String** | A free text description of the branch as provided by the financial institution to which it belongs; this is currently provided for entries with a BIC when the financial institution concerned wants to provide this extra information |  [optional]
**address** | [**Address**](Address.md) | Postal address of this institution |  [optional]
**contactDetails** | [**ContactDetails**](ContactDetails.md) | Information about how the party can be contacted |  [optional]
**officeType** | **String** | Status of the entity in the office hierarchy |  [optional]
**swiftServices** | [**List&lt;SwiftService&gt;**](SwiftService.md) | A list of 3-character codes and names of SWIFT FIN service codes (also called value added service codes) |  [optional]
**status** | [**Status**](Status.md) |  |  [optional]



