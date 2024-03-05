package com.myblog.myblog11.Service.impl;

import com.myblog.myblog11.Entity.Post;
import com.myblog.myblog11.Repository.PostRepository;
import com.myblog.myblog11.Service.PostService;
import com.myblog.myblog11.payload.postDto;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public postDto CreatePost(postDto postdto) {
        Post post=new Post();
        post.setTitle(postdto.getTitle());
        post.setDescription(postdto.getDescription());
        post.setContent(postdto.getContent());
        Post saved = postRepository.save(post);

        postDto dto=new postDto();
        dto.setTitle(saved.getTitle());
        dto.setDescription(saved.getDescription());
        dto.setContent(saved.getContent());
        return dto;
    }
}
