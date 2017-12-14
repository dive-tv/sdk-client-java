package com.touchvie.sdk.interfaces;

import java.util.List;

import com.squareup.okhttp.Call;
import com.touchvie.sdk.ApiCallback;
import com.touchvie.sdk.ApiException;
import com.touchvie.sdk.model.Card;
import com.touchvie.sdk.model.ChannelStatus;
import com.touchvie.sdk.model.MovieStatus;
import com.touchvie.sdk.model.TvGrid;

public interface DefaultApiInterface {

	public Call getCardAsync(String authorization, String cardId, String acceptLanguage, Boolean products,
			Boolean userData, String imageSize, ApiCallback<Card> callback) throws ApiException;

	public Call getCardVersionAsync(String authorization, String cardId, String version, String acceptLanguage,
			Boolean products, Boolean userData, Boolean relations, String imageSize, ApiCallback<Card> callback)
			throws ApiException;

	public Call getLikesAsync(String authorization, String acceptLanguage, String imageSize, String paginateKey,
			String size, ApiCallback<List<Card>> callback) throws ApiException;

	public Call postLikesAsync(String authorization, String cardId, String acceptLanguage,
			final ApiCallback<Void> callback) throws ApiException;

	public Call deleteLikesAsync(String authorization, String cardId, String acceptLanguage, ApiCallback<Void> callback)
			throws ApiException;

	public Call getReadyMoviesAsync(String authorization, List<String> clientMovieIdList, String acceptLanguage,
			ApiCallback<List<MovieStatus>> callback) throws ApiException;
	
	public Call getCatalogMovieAsync(String authorization, String clientMovieId, String acceptLanguage,
			String imageSize, final ApiCallback<Card> callback) throws ApiException;
	
	public Call getStaticMovieSceneAsync(String authorization, String clientMovieId, Float timestamp,
			String acceptLanguage, Boolean relations, String imageSize, final ApiCallback<List<Card>> callback)
			throws ApiException;

	public Call getReadyChannelsAsync(String authorization, List<String> channelIdList, String acceptLanguage,
			ApiCallback<List<ChannelStatus>> callback) throws ApiException;

	public Call getChannelGridAsync(String authorization, String channelId, String acceptLanguage, String imageSize,
			ApiCallback<TvGrid> callback) throws ApiException;

	public Call getChannelMovieAsync(String authorization, String channelId, String acceptLanguage, String imageSize,
			final ApiCallback<Card> callback) throws ApiException;

	public Call getStaticChannelSceneAsync(String authorization, String channelId, String acceptLanguage,
			Boolean relations, String imageSize, final ApiCallback<List<Card>> callback) throws ApiException;
}
