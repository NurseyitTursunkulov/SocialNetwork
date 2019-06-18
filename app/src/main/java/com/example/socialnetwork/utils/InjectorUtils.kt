package com.example.socialnetwork.utils

import com.example.socialnetwork.ui.viewmodels.PostsViewModelFactory

object InjectorUtils {

    fun providePostViewModel(
    ): PostsViewModelFactory {

        return PostsViewModelFactory()
    }
}
