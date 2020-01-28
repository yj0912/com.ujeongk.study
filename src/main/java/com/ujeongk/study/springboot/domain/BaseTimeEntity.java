package com.ujeongk.study.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // createdDate, modifiedDate 도 칼럼으로 인식하도록함.
@EntityListeners(AuditingEntityListener.class) //
public class BaseTimeEntity {

    @CreatedDate // Entity 생성되어 저장될때 자동저장
    private LocalDateTime createdDate;

    @LastModifiedDate // 조회한 Entity 값 변경시 자동 저장
    private LocalDateTime modifiedDate;
}
