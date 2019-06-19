package com.example.socialnetwork.posts


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.socialnetwork.R
import kotlinx.android.synthetic.main.fragment_posts.*


class PostsFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_posts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = "Posts"
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@PostsFragment.context)
            adapter = PostAdapter()
        }
    }
}
