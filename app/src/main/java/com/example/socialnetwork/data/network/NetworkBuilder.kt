package com.example.socialnetwork.data.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import androidx.annotation.NonNull
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


class NetworkBuilder() {

    private var sClient: OkHttpClient? = null
    private var sService: RetrofitClient? = null

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("asasdadsasd")
            .client(getClient())

            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    private fun getClient(): OkHttpClient {
        var client = sClient
        if (client == null) {
            synchronized(NetworkBuilder::class.java) {
                client = sClient
                if (client == null) {
                    client = buildClient()
                    sClient = client
                }
            }
        }
        return client!!
    }

    @NonNull
    fun buildClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(LoggingInterceptor.create())
            .addInterceptor(ApiKeyInterceptor.create())
            .build()
    }

    fun recreate() {
        sClient = null
        sClient = getClient()
        sService = buildRetrofit().create(RetrofitClient::class.java)
    }
}
