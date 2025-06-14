package org.fc.fcprojectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {


    private Long id;
    private Article article; // 게시글 참조
    private String content; // 댓글 내용

    // 메타 데이터
    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; //수정일시
    private String modifiedBy; // 수정자

}
