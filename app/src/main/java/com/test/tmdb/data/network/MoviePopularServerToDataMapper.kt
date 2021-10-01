package com.test.tmdb.data.network

import com.test.tmdb.core.Abstract
import com.test.tmdb.data.MovieData
import com.test.tmdb.data.network.popularMovieModel.MovieItem

interface MoviePopularServerToDataMapper: Abstract.Mapper{

    fun map(page: Int, results: List<MovieItem>, totalPage: Int, totalResults: Int): MovieData
}