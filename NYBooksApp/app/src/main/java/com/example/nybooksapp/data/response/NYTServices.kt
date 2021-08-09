package com.example.nybooksapp.data.response

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey : String ="SSLBb6NG0IVQw4GsWE3S3EPiXJ31O4mY",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}