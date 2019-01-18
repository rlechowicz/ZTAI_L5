package com.example.lechowicz.ztai.post;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private static ArrayList<Post> posts = new ArrayList<>();
    private static int idCounter = 0;

    static {
        posts.add(new Post(++idCounter,
                "title1",
                "http://osnews.pl/wp-content/uploads/2016/06/it-grafika.jpg",
                "Lorem ipsum filet mignon hamburger ribeye rump spare ribs short."));
    }

    public List<Post> getAll() {
        return posts;
    }

    public Post get(int id) {
        return posts.get(id);
    }
}
