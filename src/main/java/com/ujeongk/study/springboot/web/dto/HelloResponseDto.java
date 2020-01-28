package com.ujeongk.study.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 모든 필드의 GET 메서드 생성
@RequiredArgsConstructor // final 필드가 붙어있는 경우 생성자를 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
