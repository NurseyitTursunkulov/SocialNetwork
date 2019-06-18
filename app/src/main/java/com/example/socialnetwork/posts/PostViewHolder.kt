package com.example.socialnetwork.posts

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.socialnetwork.R
import kotlinx.android.synthetic.main.post_item.view.*

class PostViewHolder(val view: View) : RecyclerView.ViewHolder(view){
lateinit var postImage : ImageView
    var title : TextView
    init {
        title = view.findViewById(R.id.title)
        postImage = view.findViewById(R.id.post_image)
    }

}