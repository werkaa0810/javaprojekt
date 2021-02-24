package com.websiteww.myfirst;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    int id;
    String title;
    String content;
    public Post(
    @JsonProperty("id") int id,
    @JsonProperty("title") String title,  
    @JsonProperty("content") String content){
        this.id = id;
        this.title = title;
        this.content = content;

    }


    
}
