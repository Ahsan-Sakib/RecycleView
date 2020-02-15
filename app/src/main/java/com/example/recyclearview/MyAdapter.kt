package com.example.recyclearview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.book_item.view.*

class MyAdapter(private val context: MainActivity, private val chaptersList: ArrayList<String>) :
    RecyclerView.Adapter<MyAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(
                R.layout.book_item,
                parent,
                false
            )
        )//To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return chaptersList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
      holder.bookName.text = chaptersList.get(position) //To change body of created functions use File | Settings | File Templates.
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookName = itemView.text_book
    }
}