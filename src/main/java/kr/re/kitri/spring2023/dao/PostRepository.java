package kr.re.kitri.spring2023.dao;

import kr.re.kitri.spring2023.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    public List<Post> selectAllPosts() {

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "스프링", "재밌어요", "kim"));
        posts.add(new Post(2, "스프링", "재밌어요", "lee"));
        posts.add(new Post(3, "스프링", "재밌어요", "park"));

        return posts;
    }
}
