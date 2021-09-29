package com.test.tmdb.data

import com.test.tmdb.core.Abstract
import com.test.tmdb.domain.MovieDomain

sealed class MovieData: Abstract.Object<MovieDomain, Abstract.Mapper.Empty> {
}