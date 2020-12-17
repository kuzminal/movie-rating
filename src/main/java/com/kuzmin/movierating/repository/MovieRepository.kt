package com.kuzmin.movierating.repository

import com.kuzmin.movierating.model.Movie
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface MovieRepository : ReactiveMongoRepository<Movie, Int>