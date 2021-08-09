package com.example.nybooksapp.presentation.books

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooksapp.data.Book
import com.example.nybooksapp.databinding.ItemBooksBinding

class BooksAdapter(
    private val booksList: List<Book>
) :
    RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BooksAdapter.BooksViewHolder {
        val binding = ItemBooksBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return BooksViewHolder(binding)
    }

    override fun getItemCount() = booksList.size

    override fun onBindViewHolder(holder: BooksAdapter.BooksViewHolder, position: Int) {
        holder.bindBooks(booksList[position])
    }

    class BooksViewHolder(
        private val binding: ItemBooksBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindBooks(listItem: Book) = with(binding) {
            listItem.run {
                binding.title.text = title
                binding.author.text = author
            }
        }
    }
}