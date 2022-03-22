package edu.temple.audiobookplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var bookAdapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.bookRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        bookAdapter = BookAdapter(applicationContext)
        recyclerView.adapter = bookAdapter
        bookAdapter.setDataList()
    }
}