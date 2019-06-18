package com.example.socialnetwork

import android.app.Application
import android.util.Log
import com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import java.util.concurrent.TimeUnit

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(appModule)
        }
    }
}
val appModule = module {

    single {
        RedditApi.create()
    }

}