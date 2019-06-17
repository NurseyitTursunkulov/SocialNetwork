package com.example.socialnetwork.data.network

import android.text.TextUtils
import androidx.annotation.NonNull
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException


class ApiKeyInterceptor private constructor() : Interceptor {

    private  val token: String = ""

    init {
       // token = PrefUtils.getToken()
    }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        if (TextUtils.isEmpty(token))
            return chain.proceed(chain.request())

        val request = chain.request().newBuilder()
            .addHeader("Authorization", token)
            .build()
        return chain.proceed(request)
    }

    companion object {
        fun create(): Interceptor {
            return ApiKeyInterceptor()
        }
    }
}