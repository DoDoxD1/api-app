package com.example.apiapp;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int usedId, id;
    private String title;

    @SerializedName("body")
    private String text;

    public int getUsedId() {
        return usedId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
