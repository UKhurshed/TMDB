package com.test.tmdb.data.network.popularMovieModel

import com.google.gson.annotations.SerializedName
import com.test.tmdb.core.Abstract
import com.test.tmdb.data.MovieData
import com.test.tmdb.data.network.MoviePopularServerToDataMapper

data class MoviePopularServerModel(
    @SerializedName("page")
    private val page: Int,
    @SerializedName("results")
    private val results: List<MovieItem>,
    @SerializedName("total_pages")
    private val totalPage: Int,
    @SerializedName("total_results")
    private val totalResults: Int
): Abstract.Object<MovieData, MoviePopularServerToDataMapper>  {
    override fun map(mapper: MoviePopularServerToDataMapper): MovieData {
        return mapper.map(page, results, totalPage, totalResults)
    }
}
