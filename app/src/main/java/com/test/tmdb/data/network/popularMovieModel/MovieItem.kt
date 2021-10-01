package com.test.tmdb.data.network.popularMovieModel

import com.google.gson.annotations.SerializedName
import java.util.*

data class MovieItem(
    @SerializedName("adult")
    private val isAdult: Boolean,
    @SerializedName("backdrop_path")
    private val backDropPath: String,
    @SerializedName("genre_ids")
    private val genreIds: List<Int>,
    @SerializedName("id")
    private val id: Int,
    @SerializedName("original_language")
    private val originalLanguage: String,
    @SerializedName("original_title")
    private val originalTitle: String,
    @SerializedName("overview")
    private val overview: String,
    @SerializedName("popularity")
    private val popularity: Int,
    @SerializedName("poster_path")
    private val posterPath: String,
    @SerializedName("release_date")
    private val releaseDate: Date,
    @SerializedName("title")
    private val title: String,
    @SerializedName("video")
    private val isVideo: Boolean,
    @SerializedName("vote_average")
    private val voteAverage: Double,
    @SerializedName("vote_count")
    private val voteCount: Int
)
