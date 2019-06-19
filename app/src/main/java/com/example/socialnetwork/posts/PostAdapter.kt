package com.example.socialnetwork.posts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.socialnetwork.R

class PostAdapter() :
        RecyclerView.Adapter<PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.post_item, parent, false)

        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//        holder.title.text =
        holder.bind("Zensoft")
    }

    override fun getItemCount() = 15
}