package com.myblog.myblog11.controller;

import com.myblog.myblog11.Service.PostService;
import com.myblog.myblog11.payload.postDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class postController {

    private PostService postService;

    public postController(PostService postService) {
        this.postService = postService;
    }
@PostMapping
    public ResponseEntity<postDto> CreatePost(@RequestBody postDto postdto) {
        postDto dto = postService.CreatePost(postdto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
