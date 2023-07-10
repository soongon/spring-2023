package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.model.Post;
import kr.re.kitri.spring2023.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/posts")
    public List<Post> posts() {
        return service.getAllPosts();
    }
}
