package edu.temple.audiobookplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(var context: Context, val listener: ViewListener) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {
    private var dataList = mutableListOf<BookObject>()

    internal fun setDataList() {
        dataList.add(BookObject("All Quiet on the Western Front", "Erich Maria Remarque", R.drawable.all_quiet_on_the_western_front))
        dataList.add(BookObject("The Anarachist Handbook", "Michael Malice", R.drawable.the_anarchist_handbook))
        dataList.add(BookObject("Brave New World", "Aldous Huxley", R.drawable.brave_new_world))
        dataList.add(BookObject("The Count of Monte Criston", "Alexandre Dumans", R.drawable.count_of_monte_criston))
        dataList.add(BookObject("Death of the West", "Pat Buchanan", R.drawable.death_of_the_west))
        dataList.add(BookObject("1984", "George Orwell", R.drawable.george1984))
        dataList.add(BookObject("Suprise Kill Vanish", "Annie Jacobsen", R.drawable.suprise_kill_vanish))
        dataList.add(BookObject("The Constitution", "James Madison", R.drawable.the_constitution))
        dataList.add(BookObject("The Hobbit", "J.R.R. Tolkien", R.drawable.the_hobbit))
        dataList.add(BookObject("12 Rules for Life", "Jordan Peterson", R.drawable.twelve_rules_for_life))
        dataList.add(BookObject("Blood Covenant", "Michael Franzese", R.drawable.blood_covenant))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookCover: ImageView = itemView.findViewById(R.id.bookCover)
        var bookTitle: TextView = itemView.findViewById(R.id.bookTitle)
        var bookAuthor: TextView = itemView.findViewById(R.id.bookAuthor)

        fun bind(book: BookObject, listener: ViewListener) {
            itemView.setOnClickListener {
                listener.onItemClick(book)
            }
        }
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
        holder.bind(data, listener)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}