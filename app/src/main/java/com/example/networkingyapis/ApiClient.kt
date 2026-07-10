package com.example.networkingyapis

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://futuramaapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: FuturamaApi = retrofit.create(FuturamaApi::class.java)
}