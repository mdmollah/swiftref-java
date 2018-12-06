
# Ssi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ownerBic** | **String** | The owner of the SSI Nostro Account |  [optional]
**institutionName** | **String** | Name by which an institution is known and which is usually used to identify that institution |  [optional]
**branchInformation** | **String** | A free text description of the branch as provided by the financial institution to which it belongs; for the time being this will be provided only for entries with a BIC and only when the financial institution concerned wants to provide this extra information; the information is sourced from the BIC Directory |  [optional]
**address** | [**Address**](Address.md) | Address of the owner of the SSI |  [optional]
**currencyCode** | **String** | The ISO 4217 currency code of the requested SSIs |  [optional]
**direct** | **Boolean** | Indicates whether there is a direct account relationship between the owner of the SSI and the correspondent; if false, then this means at least the first intermediary must be present |  [optional]
**correspondent** | [**CorrespondentBic**](CorrespondentBic.md) | The counterparty where the owner BIC is holding the SSI for the specified currency |  [optional]
**firstIntermediary** | [**IntermediaryBic**](IntermediaryBic.md) | Contains the BIC and the Nostro account of the first intermediary with the correspondent; the first intermediary is the owner of the account with the correspondent |  [optional]
**secondIntermediary** | [**IntermediaryBic**](IntermediaryBic.md) | Contains the BIC and the Nostro account of the second intermediary with the first intermediary; the second intermediary is the owner of the account with the first intermediary |  [optional]



