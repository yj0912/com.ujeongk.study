package com.ujeongk.study.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //json 으로 반환하는 컨트롤러로 만들어줌.
public class HelloController {

    @GetMapping("/hello") // get 요청 받을 수 있는 api 만들어줌.
    public String hello(){
        return "hello";
    }
}
