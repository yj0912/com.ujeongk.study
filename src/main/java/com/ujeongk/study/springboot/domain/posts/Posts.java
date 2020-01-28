package com.ujeongk.study.springboot.domain.posts;

import com.ujeongk.study.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 롬복 어노테이션 - 필수는 아님, 클래스내의 모든 필드 Getter 메소드 자동생성
@NoArgsConstructor // 롬복 어노테이션 - 필수는 아님, 기본 생성자 자동 추가
@Entity //jpa 어노테이션 - 필수니까 클래스에 가까이둠. , 테이블과 링크될 클래스  _ 로 테이블 매칭됨
public class Posts extends BaseTimeEntity{

    @Id // pk 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성규칙이고, identity 옵션 추가해야 자동증가됨.
    private Long id;

    @Column(length = 500, nullable = false) //Column 은 속성변경때 사용(문자열 속성)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //생성자는 필드 순서바껴도 문제 찾을 수 없음. 빌더는 다름. 어느 필드에 어떤 값을 채워야 할지 인지할수 있음.
    public Posts(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
}
