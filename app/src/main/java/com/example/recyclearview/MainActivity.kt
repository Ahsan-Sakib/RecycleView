package com.example.recyclearview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val chapterList: ArrayList<String> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chapterList.add("new ")
        chapterList.add("old ")
        chapterList.add("nata ")
        chapterList.add("new ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")
        chapterList.add("BOka ")

        layoutManager = LinearLayoutManager(this)
        recylerview.layoutManager = layoutManager
        recylerview.adapter = MyAdapter(this,chapterList)


    }
}
