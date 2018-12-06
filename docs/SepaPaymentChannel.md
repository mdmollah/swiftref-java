
# SepaPaymentChannel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the payment channel (SEPA-compliant CSM) |  [optional]
**memberType** | **String** | A payment channel has a member_type, the member_type has one of the codes DRCT, IDRC or UKWN |  [optional]
**directParticipant** | **String** | The BIC of the direct participant through which the indirectly reachable BIC can be reached; it may only be present if the payment channel&#39;s member is an indirect participant |  [optional]



