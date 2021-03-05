package com.niteshjha.practice

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

public interface JsonPlaceHolderApi {
    @GET("posts")
    fun getPosts(@Query("userId") userId : Int,
                 @Query("_sort") sort : String,
                 @Query("_order") order : String)

            : Call<List<Post?>?>?

    @GET("posts/{id}/comments")
    fun getComments(@Path("id") postId: Int): Call<List<Comment?>?>?
}

//checking