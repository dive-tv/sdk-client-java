# sdk-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.touchvie</groupId>
    <artifactId>sdk-client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.touchvie:sdk-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/sdk-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.touchvie.sdk.*;
import com.touchvie.sdk.auth.*;
import com.touchvie.sdk.model.*;
import com.touchvie.sdk.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
        String cardId = "cardId_example"; // String | Requested card ID
        String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as language-country
        try {
            apiInstance.deleteLikes(authorization, cardId, acceptLanguage);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteLikes");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://rest.dive.tv/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteLikes**](docs/DefaultApi.md#deleteLikes) | **DELETE** /likes/{card_id} | Delete card like
*DefaultApi* | [**getCard**](docs/DefaultApi.md#getCard) | **GET** /cards/{card_id} | Full card detail
*DefaultApi* | [**getCardVersion**](docs/DefaultApi.md#getCardVersion) | **GET** /cards/{card_id}/versions/{version} | Full card detail with version
*DefaultApi* | [**getCatalogMovie**](docs/DefaultApi.md#getCatalogMovie) | **GET** /movies/{client_movie_id} | Movie catalog info
*DefaultApi* | [**getChannelGrid**](docs/DefaultApi.md#getChannelGrid) | **GET** /channels/{channel_id}/grid | Channel events grid
*DefaultApi* | [**getChannelMovie**](docs/DefaultApi.md#getChannelMovie) | **GET** /channels/{channel_id} | Channel movie catalog info
*DefaultApi* | [**getLikes**](docs/DefaultApi.md#getLikes) | **GET** /likes | Get card likes
*DefaultApi* | [**getReadyChannels**](docs/DefaultApi.md#getReadyChannels) | **GET** /channels/{channel_id_list}/ready | Channel sync availability
*DefaultApi* | [**getReadyMovies**](docs/DefaultApi.md#getReadyMovies) | **GET** /movies/{client_movie_id_list}/ready | Movie sync availability
*DefaultApi* | [**getStaticChannelScene**](docs/DefaultApi.md#getStaticChannelScene) | **GET** /channels/{channel_id}/static | Static channel scene
*DefaultApi* | [**getStaticMovieScene**](docs/DefaultApi.md#getStaticMovieScene) | **GET** /movies/{client_movie_id}/static/{timestamp} | Static VOD scene
*DefaultApi* | [**postLikes**](docs/DefaultApi.md#postLikes) | **POST** /likes/{card_id} | Add card like
*DefaultApi* | [**postToken**](docs/DefaultApi.md#postToken) | **POST** /token | Token endpoint


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [AuthError](docs/AuthError.md)
 - [AwardData](docs/AwardData.md)
 - [AwardsData](docs/AwardsData.md)
 - [Card](docs/Card.md)
 - [CardContainer](docs/CardContainer.md)
 - [CardUser](docs/CardUser.md)
 - [CatalogData](docs/CatalogData.md)
 - [CatalogSync](docs/CatalogSync.md)
 - [ChannelStatus](docs/ChannelStatus.md)
 - [DupleData](docs/DupleData.md)
 - [ImageData](docs/ImageData.md)
 - [LinkData](docs/LinkData.md)
 - [ListingData](docs/ListingData.md)
 - [MapData](docs/MapData.md)
 - [MovieStatus](docs/MovieStatus.md)
 - [Product](docs/Product.md)
 - [RatingData](docs/RatingData.md)
 - [RelationModule](docs/RelationModule.md)
 - [SeasonsChapters](docs/SeasonsChapters.md)
 - [SeasonsData](docs/SeasonsData.md)
 - [SourceData](docs/SourceData.md)
 - [TextData](docs/TextData.md)
 - [TvEvent](docs/TvEvent.md)
 - [TvGrid](docs/TvGrid.md)
 - [Awards](docs/Awards.md)
 - [Catalog](docs/Catalog.md)
 - [Duple](docs/Duple.md)
 - [Image](docs/Image.md)
 - [Link](docs/Link.md)
 - [Listing](docs/Listing.md)
 - [Map](docs/Map.md)
 - [Rating](docs/Rating.md)
 - [Seasons](docs/Seasons.md)
 - [Single](docs/Single.md)
 - [Text](docs/Text.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



