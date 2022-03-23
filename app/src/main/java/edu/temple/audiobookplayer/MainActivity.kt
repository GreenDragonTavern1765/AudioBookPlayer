package edu.temple.audiobookplayer

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ViewListener {

    private lateinit var bookAdapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.bookRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        bookAdapter = BookAdapter(applicationContext, this)
        recyclerView.adapter = bookAdapter
        bookAdapter.setDataList()
    }

    override fun onItemClick(book: BookObject) {
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            var title = findViewById<TextView>(R.id.displayBookTitle)
            var cover = findViewById<ImageView>(R.id.displayBookCover)
            var author = findViewById<TextView>(R.id.displayBookAuthor)
            title.text = book.bookTitle
            cover.setImageResource(book.bookCover)
            author.text = book.bookAuthor
        } else {
            val intent = Intent(applicationContext, DisplayActivity::class.java)
            startActivity(intent)
        }
    }
}
