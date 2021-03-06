package com.websiteww.myfirst;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAction {

    public static Post[] addPost(String title, String content) throws IOException{
        ObjectMapper ObjectMapper = new ObjectMapper();
        Post[] oldPosts = ObjectMapper.readValue(new File("src/main/resources/data.json") ,Post[].class);
        Post[] newPosts = new Post[oldPosts.length+1];

        int i = 0;
		for(Post o : oldPosts){

        newPosts[i]= new Post(o.id, o.title, o.content);
        i++;
        }
        newPosts[oldPosts.length] = new Post(1,title,content);
        ObjectMapper.writeValue(new File ("src/main/resources/data.json"),newPosts);
        return newPosts;
    }
    
}
