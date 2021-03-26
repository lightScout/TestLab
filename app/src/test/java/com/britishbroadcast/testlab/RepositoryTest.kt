package com.britishbroadcast.testlab

import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class RepositoryTest {
    private lateinit var mockWebServer: MockWebServer
    private lateinit var baseUrl: HttpUrl

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        mockWebServer.enqueue(MockResponse().setBody("Hello, world!"))
        mockWebServer.enqueue(MockResponse().setBody("Hello, you."))
        mockWebServer.enqueue(MockResponse().setBody("Yo machine!"))
        baseUrl = mockWebServer.url("/v1/repository")
    }
    @Test
    fun testRequest(){

        val repository = Repository(baseUrl.toUrl().toString())
        assertEquals("Hello, world!", repository.makeRequest().body?.string())
        assertEquals("Hello, you.", repository.makeRequest().body?.string())
        assertEquals("Yo machine!", repository.makeRequest().body?.string())
    }


    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}