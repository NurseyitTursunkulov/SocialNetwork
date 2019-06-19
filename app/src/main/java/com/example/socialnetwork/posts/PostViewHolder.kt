package com.example.socialnetwork.posts

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.socialnetwork.R

class PostViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    var postImage: ImageView = view.findViewById(R.id.post_image)
    var title: TextView = view.findViewById(R.id.title)
    var avatar: ImageView = view.findViewById(R.id.avatar)
    var name: TextView= view.findViewById(R.id.name)
    var likeCount: TextView= view.findViewById(R.id.like_count)
    var date: TextView = view.findViewById(R.id.date)


    fun bind(postModel: PostModel) {
        title.text = postModel.title
        Glide.with(postImage).load(postModel.postImageUrl)
            .centerCrop().placeholder(R.drawable.tree).into(postImage)
        Glide.with(avatar).load(postModel.avatarUrl)
            .centerCrop().placeholder(R.drawable.tree)
            .apply(RequestOptions.circleCropTransform())
            .into(avatar)
        name.text = postModel.name
        likeCount.text = postModel.likeCount.toString()
        date.text = postModel.date

    }

}