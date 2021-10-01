package com.test.tmdb.data



interface MovieRepository {
    suspend fun fetchPopularMovie(): MovieData

    class Base(private val cloudDataSource: MovieCloudDataSource): MovieRepository{
        override suspend fun fetchPopularMovie() = try{
               MovieData.Success(cloudDataSource.fetchPopularMovie())
            }catch (e: Exception){
                MovieData.Fail(e)
            }


    }
}