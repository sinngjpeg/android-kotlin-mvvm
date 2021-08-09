package com.example.nybooksapp.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nybooksapp.data.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Livro 1", "Autor1"),
            Book("Livro 2", "Autor2"),
            Book("Livro 3", "Autor3")
        )
    }
}