package com.vision.andorid.search_data.network

import com.vision.andorid.search_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface SearchApi {

    // https://newsapi.org/v2/everything?q=apple&from=2022-10-14&to=2022-10-14&sortBy=popularity&apiKey=API_KEY

    @GET("everything")
    suspend fun getSearchArticles(
        @QueryMap map:MutableMap<String,String>
    ) : NewsResponse

}