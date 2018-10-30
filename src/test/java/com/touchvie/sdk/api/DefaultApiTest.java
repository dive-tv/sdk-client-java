package com.touchvie.sdk.api;

import com.touchvie.sdk.ApiClient;
import com.touchvie.sdk.model.AccessToken;
import com.touchvie.sdk.model.AuthError;
import com.touchvie.sdk.model.Card;
import com.touchvie.sdk.model.ChannelStatus;
import com.touchvie.sdk.model.MovieStatus;
import com.touchvie.sdk.model.TvGrid;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }

    
    /**
     * Delete card like
     *
     * Removes a card from current user&#39;s likes list
     */
    @Test
    public void deleteLikesTest() {
        String authorization = null;
        String cardId = null;
        String acceptLanguage = null;
        // Void response = api.deleteLikes(authorization, cardId, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Full card detail
     *
     * Retrieves a full card detail, with no relations or context
     */
    @Test
    public void getCardTest() {
        String authorization = null;
        String cardId = null;
        String acceptLanguage = null;
        Boolean products = null;
        Boolean userData = null;
        String imageSize = null;
        // Card response = api.getCard(authorization, cardId, acceptLanguage, products, userData, imageSize);

        // TODO: test validations
    }
    
    /**
     * Full card detail with version
     *
     * Retrieves a full card detail, and its relations to other cards in a given context (card version)
     */
    @Test
    public void getCardVersionTest() {
        String authorization = null;
        String cardId = null;
        String version = null;
        String acceptLanguage = null;
        Boolean products = null;
        Boolean userData = null;
        Boolean relations = null;
        String imageSize = null;
        // Card response = api.getCardVersion(authorization, cardId, version, acceptLanguage, products, userData, relations, imageSize);

        // TODO: test validations
    }
    
    /**
     * Movie catalog info
     *
     * Retrieves a movie&#39;s full card by its client ID, including catalog and cast information
     */
    @Test
    public void getCatalogMovieTest() {
        String authorization = null;
        String clientMovieId = null;
        String acceptLanguage = null;
        String imageSize = null;
        // Card response = api.getCatalogMovie(authorization, clientMovieId, acceptLanguage, imageSize);

        // TODO: test validations
    }
    
    /**
     * Channel events grid
     *
     * Returns the current and upcoming grid of TV events for the given channel
     */
    @Test
    public void getChannelGridTest() {
        String authorization = null;
        String channelId = null;
        String acceptLanguage = null;
        String imageSize = null;
        // TvGrid response = api.getChannelGrid(authorization, channelId, acceptLanguage, imageSize);

        // TODO: test validations
    }
    
    /**
     * Channel movie catalog info
     *
     * Retrieves full card detail, including catalog and cast information, for the content currently being broadcasted on the channel
     */
    @Test
    public void getChannelMovieTest() {
        String authorization = null;
        String channelId = null;
        String acceptLanguage = null;
        String imageSize = null;
        // Card response = api.getChannelMovie(authorization, channelId, acceptLanguage, imageSize);

        // TODO: test validations
    }
    
    /**
     * Get card likes
     *
     * Returns a paginated list of cards liked by current user
     */
    @Test
    public void getLikesTest() {
        String authorization = null;
        String acceptLanguage = null;
        String imageSize = null;
        String paginateKey = null;
        String size = null;
        // List<Card> response = api.getLikes(authorization, acceptLanguage, imageSize, paginateKey, size);

        // TODO: test validations
    }
    
    /**
     * Channel sync availability
     *
     * Checks if a list of client channel identifiers are currently broadcasting synchronizable content
     */
    @Test
    public void getReadyChannelsTest() {
        String authorization = null;
        List<String> channelIdList = null;
        String acceptLanguage = null;
        // List<ChannelStatus> response = api.getReadyChannels(authorization, channelIdList, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Movie sync availability
     *
     * Checks whether a list of client movie identifiers (Video On Demand) are available to be synchronized using the Dive API
     */
    @Test
    public void getReadyMoviesTest() {
        String authorization = null;
        List<String> clientMovieIdList = null;
        String acceptLanguage = null;
        // List<MovieStatus> response = api.getReadyMovies(authorization, clientMovieIdList, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Static channel scene
     *
     * Retrieves the list of cards related to the content currently being broadcasted in the given channel
     */
    @Test
    public void getStaticChannelSceneTest() {
        String authorization = null;
        String channelId = null;
        String acceptLanguage = null;
        Boolean relations = null;
        String imageSize = null;
        // List<Card> response = api.getStaticChannelScene(authorization, channelId, acceptLanguage, relations, imageSize);

        // TODO: test validations
    }
    
    /**
     * Static VOD scene
     *
     * Retrieves the current list of cards related to the given movie scene
     */
    @Test
    public void getStaticMovieSceneTest() {
        String authorization = null;
        String clientMovieId = null;
        Float timestamp = null;
        String acceptLanguage = null;
        Boolean relations = null;
        String imageSize = null;
        // List<Card> response = api.getStaticMovieScene(authorization, clientMovieId, timestamp, acceptLanguage, relations, imageSize);

        // TODO: test validations
    }
    
    /**
     * Add card like
     *
     * Stores a card under current user&#39;s likes list
     */
    @Test
    public void postLikesTest() {
        String authorization = null;
        String cardId = null;
        String acceptLanguage = null;
        // Void response = api.postLikes(authorization, cardId, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Token endpoint
     *
     * The token endpoint is used to obtain access tokens which allow clients to make API requests
     */
    @Test
    public void postTokenTest() {
        String authorization = null;
        String grantType = null;
        String acceptLanguage = null;
        String deviceId = null;
        String refreshToken = null;
        // AccessToken response = api.postToken(authorization, grantType, acceptLanguage, deviceId, refreshToken);

        // TODO: test validations
    }
    
}
