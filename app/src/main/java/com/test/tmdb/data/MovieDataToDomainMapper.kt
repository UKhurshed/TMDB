package com.test.tmdb.data

import com.test.tmdb.core.Abstract
import com.test.tmdb.data.network.popularMovieModel.MoviePopularServerModel
import com.test.tmdb.domain.MovieDomain
import retrofit2.HttpException
import java.net.UnknownHostException

interface MovieDataToDomainMapper: Abstract.Mapper {
    fun map(popularServerModel: MoviePopularServerModel): MovieDomain

    fun map(exception: Exception): MovieDomain

    class Base: MovieDataToDomainMapper{
        override fun map(popularServerModel: MoviePopularServerModel): MovieDomain {
            return MovieDomain.Success(popularServerModel)
        }

        override fun map(exception: Exception): MovieDomain {
            val errorType = when(exception){
                is UnknownHostException -> 0 // enum class errorType { NoConnection
                is HttpException -> 1 // ServiceUnavailable
                else -> 2 // GenericException
            }
            return MovieDomain.Fail(errorType)
        }

    }
}