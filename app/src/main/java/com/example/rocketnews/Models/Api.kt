package com.example.rocketnews.Models

import retrofit2.Call
import retrofit2.http.*

interface Api {

    @GET("top-headlines")
    fun TopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String,
    ): Call<NewsApiResponse>

}