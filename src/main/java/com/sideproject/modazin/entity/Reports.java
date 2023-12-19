package com.sideproject.modazin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "reports")
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reports_seq", nullable = false)
    private int reportSeq;
    @Column(name="user_seq", nullable = false)
    private int userSeq;
    @Column(name="category_seq", nullable = false)
    private int categorySeq;
    @Column(name="post_seq", nullable = false)
    private int postSeq;
    @Column(name="comment_seq")
    private int commentSeq;
    @Lob // 큰 사이즈의 문자 데이터로 저장
    @Column(name="content", nullable = false)
    private String content;
    @Column(name="created_at", nullable = false)
    private Date createdAt;
}
