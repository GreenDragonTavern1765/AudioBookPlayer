package edu.temple.audiobookplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(var context: Context) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    private var dataList = mutableListOf<BookObject>()

    internal fun setDataList() {
        dataList.add(BookObject("All Quiet on the Western Front",
            "Erique Remaurque", R.drawable.all_quiet_on_the_western_front))
        dataList.add(
            BookObject("The Anarchist's Handbook", "Michael Malice",
        R.drawable.the_anarchist_handbook)
        )
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookCover: ImageView = itemView.findViewById(R.id.bookCover)
        var bookTitle: TextView = itemView.findViewById(R.id.bookTitle)
        var bookAuthor: TextView = itemView.findViewById(R.id.bookAuthor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]
        holder.bookAuthor.text = data.bookAuthor
        holder.bookTitle.text = data.bookTitle
        holder.bookCover.setImageResource(data.bookCover)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}