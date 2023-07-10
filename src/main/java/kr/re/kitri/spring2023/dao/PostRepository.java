package kr.re.kitri.spring2023.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public String selectAllPosts() {
        return "전체 글 목록..";
    }
}
