package com.test.tmdb.data.network

import com.test.tmdb.BuildConfig
import com.test.tmdb.data.network.popularMovieModel.MoviePopularServerModel
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("popular")
    suspend fun fetchPopularMovie(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): MoviePopularServerModel
}

/*
    https://api.themoviedb.org/3/movie/
    api_key= e52aea7c749d26d538c2e618665e67e0
*/