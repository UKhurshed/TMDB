package com.test.tmdb.data

import com.test.tmdb.data.network.popularMovieModel.MoviePopularServerModel
import com.test.tmdb.data.network.MovieService

interface MovieCloudDataSource {
    suspend fun fetchPopularMovie(): MoviePopularServerModel

    class Base(private val service: MovieService): MovieCloudDataSource{
        override suspend fun fetchPopularMovie(): MoviePopularServerModel {
            return service.fetchPopularMovie()
        }

    }
}