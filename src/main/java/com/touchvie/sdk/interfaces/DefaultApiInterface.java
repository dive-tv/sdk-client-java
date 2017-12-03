package com.touchvie.sdk.interfaces;

import java.util.List;

import com.squareup.okhttp.Call;
import com.touchvie.sdk.ApiCallback;
import com.touchvie.sdk.ApiException;
import com.touchvie.sdk.model.Card;
import com.touchvie.sdk.model.ChannelStatus;
import com.touchvie.sdk.model.MovieStatus;

public interface DefaultApiInterface {

	public Call getCardAsync(String authorization, String cardId, String acceptLanguage, Boolean products,
			Boolean userData, String imageSize, ApiCallback<Card> callback) throws ApiException;

	public Call getCardVersionAsync(String authorization, String cardId, String version, String acceptLanguage,
			Boolean products, Boolean userData, Boolean relations, String imageSize, ApiCallback<Card> callback)
			throws ApiException;

	public Call getReadyMoviesAsync(String authorization, List<String> clientMovieIdList, String acceptLanguage,
			ApiCallback<List<MovieStatus>> callback) throws ApiException;

	public Call getReadyChannelsAsync(String authorization, List<String> channelIdList, String acceptLanguage,
			ApiCallback<List<ChannelStatus>> callback) throws ApiException;
}
