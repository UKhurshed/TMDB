package com.test.tmdb.core

import android.app.Application
import com.test.tmdb.data.network.MovieService
import retrofit2.Retrofit

class MovieApp: Application() {

    private companion object{
        const val BASE_URL ="https://api.themoviedb.org/3/movie/"
    }

    override fun onCreate() {
        super.onCreate()

        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
        val service = retrofit.create(MovieService::class.java)
    }
}