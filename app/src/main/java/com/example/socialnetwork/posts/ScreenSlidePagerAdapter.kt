package com.example.socialnetwork.posts

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        when (position) {
            1 -> return PostsFragment()
            else ->return  PostsFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            1 -> return "Actors"
            else ->return "hz"
        }

    }
}
