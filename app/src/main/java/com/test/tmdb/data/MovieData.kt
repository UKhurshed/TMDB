package com.test.tmdb.data

import com.test.tmdb.core.Abstract
import com.test.tmdb.data.network.popularMovieModel.MoviePopularServerModel
import com.test.tmdb.domain.MovieDomain

sealed class MovieData: Abstract.Object<MovieDomain, MovieDataToDomainMapper> {

    class Success(private val popularMovie: MoviePopularServerModel): MovieData(){
        override fun map(mapper: MovieDataToDomainMapper): MovieDomain {
            return mapper.map(popularMovie)
        }

    }
    class Fail(private val exception: Exception): MovieData() {
        override fun map(mapper: MovieDataToDomainMapper): MovieDomain {
            return mapper.map(exception)
        }
    }


}