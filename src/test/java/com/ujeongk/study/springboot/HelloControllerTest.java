package com.ujeongk.study.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) //스프링부트와
@WebMvcTest //Web 에 집중할 수 있는 테스트 어노테이션
public class HelloControllerTest {

    @Autowired // 빈을 주입받음
    private MockMvc mvc; // web api test

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        //get 요청하고 검증이어서 선언 가능.
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
