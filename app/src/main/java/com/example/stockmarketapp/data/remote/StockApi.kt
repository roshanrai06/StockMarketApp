package com.example.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {
    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(@Query("apiKey") apiKey: String): ResponseBody

    companion object {
        const val API_KEY = "MI5ZFKQN2735TZRG"
        const val BASE_URL = "https://alphavantage.co"
    }
}
