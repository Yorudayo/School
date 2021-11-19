package android.lifeistech.school2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import io.realm.OrderedRealmCollection


//class ObjectAdapter (
//    private val title: Context,
//    private var objectList: OrderedRealmCollection<Object>?,
//    private var listener: OnItemclickListener,
//    private val autoUpdate: Boolean
//)  :
//
//RealmRecyclerViewAdapter<Object, ObjectAdapter.BookShelfViewHolder>(bookList, autoUpdate) {
//    override fun getItemCount(): Int = bookList?.size ?:0
//    override fun onBindViewHolder(holder: BookShelfViewHolder, position: Int) {
//        val book: Book = bookList?.get(position) ?: return
//        holder.container.setOnClickListener{
//            listener.onItemClick(book)
//        }
//        holder.bookImageView.setImageResource(R.drawable.bookimage)
//        holder.bookTitleTextView.text = book.title
//    }
//
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType:Int): BookShelfViewHolder {
//        val v = LayoutInflater.from(context).inflate(R.layout.item_memo_data_cell, viewGroup,false)
//        return ObjectViewHolder(v)
//    }
//
//    class ObjectViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val bookImageView: ImageView = view.bookImageView
//        val bookTitleTextView: TextView = view.bookTitleTextView
//        val container : CardView = view.CardView
//    }
//
//    interface OnItemClickListener {
//        fun onItemClick(item: Book)
//    }
//
//)