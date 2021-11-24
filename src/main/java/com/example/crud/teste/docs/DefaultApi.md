# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/pgmedeiros/poc_api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usuarioGet**](DefaultApi.md#usuarioGet) | **GET** /usuario | 
[**usuarioPost**](DefaultApi.md#usuarioPost) | **POST** /usuario | 

<a name="usuarioGet"></a>
# **usuarioGet**
> Usuario usuarioGet()



### Example
```java
// Import classes:
//import com.baeldung.petstore.client.invoker.ApiException;
//import com.baeldung.petstore.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Usuario result = apiInstance.usuarioGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Usuario**](Usuario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usuarioPost"></a>
# **usuarioPost**
> usuarioPost(body)



### Example
```java
// Import classes:
//import com.baeldung.petstore.client.invoker.ApiException;
//import com.baeldung.petstore.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Usuario body = new Usuario(); // Usuario | 
try {
    apiInstance.usuarioPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Usuario**](Usuario.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

