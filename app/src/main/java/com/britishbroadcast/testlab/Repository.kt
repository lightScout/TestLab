package com.britishbroadcast.testlab

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class Repository(private val baseUrl: String) {

    fun makeRequest(): Response{
        val okHttpClient = OkHttpClient()
        return okHttpClient.newCall(createRequest()).execute()
    }

    fun createRequest(): Request{
        return Request.Builder()
                .url(baseUrl)
                .build()
    }



}