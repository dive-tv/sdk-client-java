
# AccessToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | Auth token, must be included on every API request |  [optional]
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Token type |  [optional]
**refreshToken** | **String** | Allows to issue new access tokens without resending client credentials |  [optional]
**expiresIn** | **Integer** | Expiration time (in seconds). |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Granted auth scope |  [optional]


<a name="TokenTypeEnum"></a>
## Enum: TokenTypeEnum
Name | Value
---- | -----
BEARER | &quot;bearer&quot;


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
DEVICE | &quot;device&quot;



