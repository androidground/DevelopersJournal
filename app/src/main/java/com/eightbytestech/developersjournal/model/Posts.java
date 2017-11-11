package com.eightbytestech.developersjournal.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vishal on 12/11/17.
 */

public class Posts implements Parcelable {

    /*
    id, modified, link, title, content, excerpt, featured_media
     */

    @SerializedName("id")
    public int id;

    @SerializedName("modified")
    public String modifiedDate;

    @SerializedName("link")
    public String postLink;

    @SerializedName("title")
    public String postTitle;

    @SerializedName("content")
    public String postContent;

    @SerializedName("excerpt")
    public String postExcerpt;

    @SerializedName("featured_media")
    public String featuredMedia;

    public Posts(int id, String modifiedDate, String link, String title, String content, String excerpt, String featured_media) {
        this.id = id;
        this.modifiedDate = modifiedDate;
        this.postLink = link;
        this.postTitle = title;
        this.postContent = content;
        this.postExcerpt = excerpt;
        this.featuredMedia = "https://developersjournal.in/wp-json/wp/v2/media/" + featured_media;
    }

    public Posts(Parcel parcel) {
        this.id = parcel.readInt();
        this.modifiedDate = parcel.readString();
        this.postLink = parcel.readString();
        this.postTitle = parcel.readString();
        this.postContent = parcel.readString();
        this.postExcerpt = parcel.readString();
        this.featuredMedia = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(modifiedDate);
        parcel.writeString(postLink);
        parcel.writeString(postTitle);
        parcel.writeString(postContent);
        parcel.writeString(postExcerpt);
        parcel.writeString("https://developersjournal.in/wp-json/wp/v2/media/" + featuredMedia);
    }

    public static Creator<Posts> CREATOR = new Creator<Posts>() {

        @Override
        public Posts createFromParcel(Parcel source) {
            return new Posts(source);
        }

        @Override
        public Posts[] newArray(int size) {
            return new Posts[size];
        }
    };
}
