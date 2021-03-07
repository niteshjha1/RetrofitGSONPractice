package com.niteshjha.practice

import retrofit2.Call
import retrofit2.http.*

interface JsonPlaceHolderApi {

    @GET("posts")
    fun getPosts(
            @Query("userId") userId: Array<Int?>?,
            @Query("_sort") sort: String?,
            @Query("_order") order: String?) : Call<List<Post?>?>?

    @GET("posts")
    fun getPosts(@QueryMap parameters: Map<String?, String?>?): Call<List<Post?>?>?

    @GET("posts/{id}/comments")
    fun getComments(@Path("id") postId: Int): Call<List<Comment?>?>?


//    @POST("posts")
//    fun createPost(@Body post: Post?): Call<Post?>?

    @FormUrlEncoded
    @POST("posts")
    fun createPost(
            @Field("userId") userId: Int,
            @Field("title") title: String?,
            @Field("body") body: String?): Call<Post?>?
}


