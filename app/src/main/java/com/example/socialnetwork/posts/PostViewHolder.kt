package com.example.socialnetwork.posts

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.socialnetwork.R

class PostViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
     var postImage: ImageView
    var title: TextView

    init {
        title = view.findViewById(R.id.title)
        postImage = view.findViewById(R.id.post_image)
    }

    fun bind(item: String){
        title = view.findViewById(R.id.title)
    }

}