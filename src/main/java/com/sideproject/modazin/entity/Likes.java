package com.sideproject.modazin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="likes_seq", nullable = false)
    private int likeSeq;
    @Column(name="user_seq", nullable = false)
    private int userSeq;
    @Column(name="category_seq", nullable = false)
    private int categorySeq;
    @Column(name="post_seq", nullable = false)
    private int postSeq;
    @Column(name="status", nullable = false)
    private String status;
}
