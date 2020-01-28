package com.ujeongk.study.springboot.web;

import com.ujeongk.study.springboot.service.posts.PostsService;
import com.ujeongk.study.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    //@GetMapping("/")
    //public String index()
    //{
    //    return "index";
    //}

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/")
    public String index(Model model) // 서버 템플릿의 객체 저장
    {
        model.addAttribute("posts" , postsService.findAllDesc()); //결과를 posts로 index머스타취로 전달
        return "index";
    }

    @GetMapping("/posts/update/{id}")
    public  String postsUpdate(@PathVariable Long id, Model model)
    {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }
}
