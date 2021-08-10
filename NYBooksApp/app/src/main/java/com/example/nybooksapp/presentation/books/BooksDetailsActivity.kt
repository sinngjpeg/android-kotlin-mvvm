package com.example.nybooksapp.presentation.books

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nybooksapp.databinding.ActivityBooksDetailsBinding

class BooksDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleDetails.text = intent.getStringExtra(Intent.EXTRA_TITLE)
        binding.descriptionDetails.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }

    companion object {
        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"

        fun getStartIntent(context: Context, title: String, description: String): Intent {
            return Intent(context, BooksDetailsActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_DESCRIPTION, description)
            }
        }
    }
}