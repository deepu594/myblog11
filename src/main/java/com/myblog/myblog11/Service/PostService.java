package com.myblog.myblog11.Service;

import com.myblog.myblog11.payload.postDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    postDto CreatePost(postDto postdto);

}
