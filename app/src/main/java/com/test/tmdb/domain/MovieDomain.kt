package com.test.tmdb.domain

import com.test.tmdb.core.Abstract
import com.test.tmdb.data.network.popularMovieModel.MoviePopularServerModel
import com.test.tmdb.presentation.MovieUi

sealed class MovieDomain: Abstract.Object<MovieUi, Abstract.Mapper.Empty>{

    class Success(private val popularServerModel: MoviePopularServerModel): MovieDomain(){
        override fun map(mapper: Abstract.Mapper.Empty): MovieUi {
            TODO("Not yet implemented")
        }

    }

    class Fail(private val errorType: Int): MovieDomain(){
        override fun map(mapper: Abstract.Mapper.Empty): MovieUi {
            TODO("Not yet implemented")
        }

    }
}
