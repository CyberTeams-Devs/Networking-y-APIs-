package com.example.networkingyapis

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FuturamaApi {
    @GET("characters")
    fun getCharacters(
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 10,
        @Query("gender") gender: String? = null,
        @Query("species") species: String? = null
    ): Call<CharacterResponse>
}