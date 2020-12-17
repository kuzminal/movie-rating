package com.kuzmin.movierating.exceptions

class MovieNotFoundException : Exception {
    constructor(message : String) : super(message);
    companion object {
        fun create(id : Int) : MovieNotFoundException {
            return MovieNotFoundException("Movie by id $id, not found");
        }
    }
}