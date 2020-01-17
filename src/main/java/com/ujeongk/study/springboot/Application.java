package com.ujeongk.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//스프링부트의 자동설정, 빈 읽기생성을 모두 자동으로 설정 - 프로젝트 최상단에 위치해야함(해당위치부터 설정읽어나감)
public class Application {
    public static void main(String[] args) //main class
    {
        SpringApplication.run(Application.class, args);//내장 was 실행 -> 외부서버에 톰캣설치할 필요가 없고, 스프링부트로 만들어진 jar 파일로 실행하면됨.
    }
}
