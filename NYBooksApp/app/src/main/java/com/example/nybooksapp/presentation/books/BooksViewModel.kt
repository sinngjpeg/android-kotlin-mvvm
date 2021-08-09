package com.example.nybooksapp.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nybooksapp.data.Book
import com.example.nybooksapp.data.response.ApiService
import com.example.nybooksapp.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()
    fun getBooks() {
        ApiService.service.getBooks().enqueue(object : Callback<BookBodyResponse> {
            override fun onResponse(
                call: Call<BookBodyResponse>,
                response: Response<BookBodyResponse>
            ) {
                if (response.isSuccessful) {
                    val books: MutableList<Book> = mutableListOf()
                    response.body()?.let {
                        for (result in it.bookResults) {
                            val book = Book(
                                title = result.bookDetailsResponse[0].title,
                                author = result.bookDetailsResponse[0].author
                            )
                            books.add(book)
                        }
                    }
                    booksLiveData.value = books
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

    }
}

