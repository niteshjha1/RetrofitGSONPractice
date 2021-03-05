package com.niteshjha.practice

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

public interface JsonPlaceHolderApi {
    @GET("posts")
    fun getPosts(): Call<List<Post?>?>?

    @GET("posts/{id}/comments")
    fun getComments(@Path("id") postId: Int): Call<List<Comment?>?>?
}