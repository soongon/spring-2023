package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.PostRepository;
import kr.re.kitri.spring2023.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts() {
        return postRepository.selectAllPosts();
    }
}
