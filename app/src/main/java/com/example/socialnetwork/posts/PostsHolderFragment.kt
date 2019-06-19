package com.example.socialnetwork.posts


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.socialnetwork.R
import kotlinx.android.synthetic.main.fragment_posts_holder.*


class PostsHolderFragment : Fragment() {
    private lateinit var mPager: ViewPager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_posts_holder, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = "Posts"
        mPager =  view.findViewById(R.id.viewpager)
        tabs.setupWithViewPager(mPager)
        mPager.adapter = fragmentManager?.let { ScreenSlidePagerAdapter(it) }
    }

}
