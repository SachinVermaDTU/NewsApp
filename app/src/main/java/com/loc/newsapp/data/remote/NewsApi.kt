package com.loc.newsapp.data.remote

import com.loc.newsapp.data.remote.dto.NewsResponse
import com.loc.newsapp.util.Constants
import retrofit2.http.Query
import retrofit2.http.GET

interface NewsApi {
    @GET("everything")
    suspend fun getNews(
        @Query("page") page : Int,
        @Query("sources") sources : String,
        @Query("apiKey") apiKey: String = Constants.API_KEY
            // api level
        ):NewsResponse

}