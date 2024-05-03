import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.time_tracking.R

class EntryAdapter(private val entries: List<Entry>) : RecyclerView.Adapter<EntryAdapter.EntryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category_activity, parent, false)
        return EntryViewHolder(view)
    }

    override fun onBindViewHolder(holder: EntryViewHolder, position: Int) {
        val entry = entries[position]
        holder.bind(entry)
    }

    override fun getItemCount(): Int {
        return entries.size
    }

    inner class EntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewDate: TextView = itemView.findViewById(R.id.textViewCategory)
        // Add other TextViews for other entry details

        @SuppressLint("SetTextI18n")
        fun bind(entry: Entry?) {
            entry?.let {
                textViewDate.text = "Date: ${entry.date}"
                // Set other details similarly for other views
            }
        }

    }
}
data class Entry(
    val date: String,
    val startTime: String,
    val endTime: String,
    val description: String,
    val category: String,
    // Add any other properties you need
)