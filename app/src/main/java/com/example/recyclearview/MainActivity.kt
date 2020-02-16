package com.example.recyclearview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val chapterList: ArrayList<Book> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chapterList.add(0,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(1,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(2,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(3,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(4,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(5,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(6,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(7,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(8,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(9,Book(R.drawable.ic_launcher_background,"new"))
        chapterList.add(10,Book(R.drawable.ic_launcher_background,"new"))

        layoutManager = LinearLayoutManager(this)
        recylerview.layoutManager = layoutManager
        recylerview.adapter = MyAdapter(this,chapterList)


    }
}
