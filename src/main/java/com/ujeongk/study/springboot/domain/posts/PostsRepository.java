package com.ujeongk.study.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//database 접근도와주는 인터페이스
public interface PostsRepository extends JpaRepository<Posts, Long> { //CRUD 메소드 자동 생성
    //Entity 와 Repository 는 함께 위치 해야 함. -> 그래서 한 패키지 안에서 관리, 나중에 함께 옮기기도 쉬움.
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
