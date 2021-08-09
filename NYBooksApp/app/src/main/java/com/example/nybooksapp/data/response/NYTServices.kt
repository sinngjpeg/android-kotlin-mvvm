package com.example.nybooksapp.data.response

import com.example.nybooksapp.data.Book
import retrofit2.Call
import retrofit2.http.GET


interface NYTServices {
    @GET("lists.json")
    fun listRepos(): Call<List<Book>>
}