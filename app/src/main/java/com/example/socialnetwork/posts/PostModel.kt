package com.example.socialnetwork.posts

data class PostModel(
    var postImageUrl: String,
    var avatarUrl: String,
    var title: String,
    var name: String,
    var likeCount: Int,
    var date: String
)