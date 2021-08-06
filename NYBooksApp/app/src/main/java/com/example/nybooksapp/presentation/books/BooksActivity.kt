package com.example.nybooksapp.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nybooksapp.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarMain.title = "Books"
        setSupportActionBar(binding.toolbarMain)
    }
}