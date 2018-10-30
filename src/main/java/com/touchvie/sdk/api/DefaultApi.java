package com.touchvie.sdk.api;

import com.touchvie.sdk.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import com.touchvie.sdk.api.InterfaceApi;
import com.touchvie.sdk.model.AccessToken;
import com.touchvie.sdk.model.AuthError;
import com.touchvie.sdk.model.Card;
import com.touchvie.sdk.model.ChannelStatus;
import com.touchvie.sdk.model.MovieStatus;
import com.touchvie.sdk.model.TvGrid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DefaultApi implements InterfaceApi{
  /**
   * Delete card like
   * Removes a card from current user&#39;s likes list
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param cardId Requested card ID (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("likes/{card_id}")
  Call<Void> deleteLikes(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("card_id") String cardId, @retrofit2.http.Header("Accept-Language") String acceptLanguage
  );

  /**
   * Full card detail
   * Retrieves a full card detail, with no relations or context
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param cardId Unique identifier for this card (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param products Indicates if cards should contain commercial products when available (true) or not (false) (optional, default to true)
   * @param userData Indicates if cards should contain user data when available (true) or not (false) (optional, default to true)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;Card&gt;
   */
  @GET("cards/{card_id}")
  Call<Card> getCard(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("card_id") String cardId, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("products") Boolean products, @retrofit2.http.Query("user_data") Boolean userData, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Full card detail with version
   * Retrieves a full card detail, and its relations to other cards in a given context (card version)
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param cardId Unique identifier for this card (required)
   * @param version Version identifier, indicates the context where the card is being requested (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param products Indicates if cards should contain commercial products when available (true) or not (false) (optional, default to true)
   * @param userData Indicates if cards should contain user data when available (true) or not (false) (optional, default to true)
   * @param relations Indicates if cards should contain the scene hierarchy (true) or not (false) (optional, default to true)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;Card&gt;
   */
  @GET("cards/{card_id}/versions/{version}")
  Call<Card> getCardVersion(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("card_id") String cardId, @retrofit2.http.Path("version") String version, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("products") Boolean products, @retrofit2.http.Query("user_data") Boolean userData, @retrofit2.http.Query("relations") Boolean relations, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Movie catalog info
   * Retrieves a movie&#39;s full card by its client ID, including catalog and cast information
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param clientMovieId Client movie ID being played (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;Card&gt;
   */
  @GET("movies/{client_movie_id}")
  Call<Card> getCatalogMovie(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("client_movie_id") String clientMovieId, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Channel events grid
   * Returns the current and upcoming grid of TV events for the given channel
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param channelId Client channel ID (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;TvGrid&gt;
   */
  @GET("channels/{channel_id}/grid")
  Call<TvGrid> getChannelGrid(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Channel movie catalog info
   * Retrieves full card detail, including catalog and cast information, for the content currently being broadcasted on the channel
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param channelId Client channel ID (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;Card&gt;
   */
  @GET("channels/{channel_id}")
  Call<Card> getChannelMovie(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Get card likes
   * Returns a paginated list of cards liked by current user
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @param paginateKey Paginate key (optional)
   * @param size Number of desired results (optional, default to 20)
   * @return Call&lt;List&lt;Card&gt;&gt;
   */
  @GET("likes")
  Call<List<Card>> getLikes(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("image_size") String imageSize, @retrofit2.http.Query("paginate_key") String paginateKey, @retrofit2.http.Query("size") String size
  );

  /**
   * Channel sync availability
   * Checks if a list of client channel identifiers are currently broadcasting synchronizable content
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param channelIdList List of client channel IDs as a comma separated list (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @return Call&lt;List&lt;ChannelStatus&gt;&gt;
   */
  @GET("channels/{channel_id_list}/ready")
  Call<List<ChannelStatus>> getReadyChannels(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("channel_id_list") List<String> channelIdList, @retrofit2.http.Header("Accept-Language") String acceptLanguage
  );

  /**
   * Movie sync availability
   * Checks whether a list of client movie identifiers (Video On Demand) are available to be synchronized using the Dive API
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param clientMovieIdList List of client movie IDs, provided as a comma separated list (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @return Call&lt;List&lt;MovieStatus&gt;&gt;
   */
  @GET("movies/{client_movie_id_list}/ready")
  Call<List<MovieStatus>> getReadyMovies(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("client_movie_id_list") List<String> clientMovieIdList, @retrofit2.http.Header("Accept-Language") String acceptLanguage
  );

  /**
   * Static channel scene
   * Retrieves the list of cards related to the content currently being broadcasted in the given channel
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param channelId Client channel ID (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param relations Indicates if cards should contain the scene hierarchy (true) or not (false) (optional, default to true)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;List&lt;Card&gt;&gt;
   */
  @GET("channels/{channel_id}/static")
  Call<List<Card>> getStaticChannelScene(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("relations") Boolean relations, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Static VOD scene
   * Retrieves the current list of cards related to the given movie scene
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param clientMovieId Client movie ID being played (required)
   * @param timestamp Current movie timestamp in seconds (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param relations Indicates if cards should contain the scene hierarchy (true) or not (false) (optional, default to true)
   * @param imageSize Size of the images returned in the response (optional, default to m)
   * @return Call&lt;List&lt;Card&gt;&gt;
   */
  @GET("movies/{client_movie_id}/static/{timestamp}")
  Call<List<Card>> getStaticMovieScene(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("client_movie_id") String clientMovieId, @retrofit2.http.Path("timestamp") Float timestamp, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Query("relations") Boolean relations, @retrofit2.http.Query("image_size") String imageSize
  );

  /**
   * Add card like
   * Stores a card under current user&#39;s likes list
   * @param authorization Authorization token (&#39;Bearer &lt;token&gt;&#39;) (required)
   * @param cardId Requested card ID (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("likes/{card_id}")
  Call<Void> postLikes(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("card_id") String cardId, @retrofit2.http.Header("Accept-Language") String acceptLanguage
  );

  /**
   * Token endpoint
   * The token endpoint is used to obtain access tokens which allow clients to make API requests
   * @param authorization Basic authorization token (&#39;Basic &lt;client_key&gt;&#39;) (required)
   * @param grantType Grant type used to obtain the token. (required)
   * @param acceptLanguage Client locale, as language-country (optional)
   * @param deviceId Device identifier, must uniquely identify the user or device accessing the API. Required only for \&quot;device_credentials\&quot; grant type (optional)
   * @param refreshToken Refresh token, used to issue a new token without resending client credentials. Required only for \&quot;refresh_token\&quot; grant type (optional)
   * @return Call&lt;AccessToken&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("token")
  Call<AccessToken> postToken(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Query("grant_type") String grantType, @retrofit2.http.Header("Accept-Language") String acceptLanguage, @retrofit2.http.Field("device_id") String deviceId, @retrofit2.http.Field("refresh_token") String refreshToken
  );

}
