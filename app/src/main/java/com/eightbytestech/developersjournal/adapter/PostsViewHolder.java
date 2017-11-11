package com.eightbytestech.developersjournal.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vishal on 12/11/17.
 */

public class PostsViewHolder extends RecyclerView.ViewHolder {

    ImageView postImage;
    TextView postTitle;

    public PostsViewHolder(View postsView) {
        super(postsView);
    }
}
