package com.example.nybooksapp.presentation.books

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooksapp.data.Book
import com.example.nybooksapp.databinding.ItemBooksBinding

class BooksAdapter(
    private val booksList: List<Book>,
    val onItemClickListener: ((book: Book) -> Unit)
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
        return BooksViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount() = booksList.size

    override fun onBindViewHolder(holder: BooksAdapter.BooksViewHolder, position: Int) {
        holder.bindBooks(booksList[position])
    }

    class BooksViewHolder(
        private val binding: ItemBooksBinding,
        private val onItemClickListener: ((book: Book) -> Unit)
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindBooks(listItem: Book) = with(binding) {
            listItem.run {
                binding.title.text = title
                binding.author.text = author

                itemView.setOnClickListener {
                    onItemClickListener.invoke(listItem)
                }
            }
        }
    }
}