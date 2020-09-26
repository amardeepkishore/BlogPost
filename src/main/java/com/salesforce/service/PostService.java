package com.salesforce.service;

import com.salesforce.model.Post;
import javafx.geometry.Pos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public PostService() {
        System.out.println("*** PostService ***");
    }

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<Post>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<Post>();
        Post post = new Post();
        post.setTitle("This is your first post.");
        post.setBody("This is your post, It has a valid content");
        post.setDate(new Date());
        posts.add(post);

        return posts;
    }
}
