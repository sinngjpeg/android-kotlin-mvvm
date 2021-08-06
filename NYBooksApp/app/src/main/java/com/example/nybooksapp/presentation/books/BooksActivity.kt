package com.example.nybooksapp.presentation.books

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooksapp.data.Book
import com.example.nybooksapp.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView()
    }

    private fun recyclerView() {
        with(binding.recyclerViewMain) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(arrayListOf(
                Book("Livro 1", "Autor1"),
                Book("Livro 2", "Autor2"),
                Book("Livro 3", "Autor3")
            ))
        }
    }
}