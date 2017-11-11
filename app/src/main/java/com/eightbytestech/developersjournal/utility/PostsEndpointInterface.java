package com.eightbytestech.developersjournal.utility;

import com.eightbytestech.developersjournal.model.Posts;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vishal on 12/11/17.
 */

public interface PostsEndpointInterface {

    @GET("posts/")
    Call<Posts> getAllPosts(
            @Query(value = "page", encoded = true) String pageNumber
    );
}
