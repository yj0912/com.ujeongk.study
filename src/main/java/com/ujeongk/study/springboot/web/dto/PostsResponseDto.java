package com.ujeongk.study.springboot.web.dto;

import com.ujeongk.study.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto { // entitle 의 필드 일부만 사용하므로 entity 에서 받아서 처리
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
