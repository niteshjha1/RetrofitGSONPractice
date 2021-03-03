package com.niteshjha.practice

import retrofit2.Call
import retrofit2.http.GET

public interface JsonPlaceHolderApi {
    @GET("posts")
    fun getPosts(): Call<List<Post?>?>?
}