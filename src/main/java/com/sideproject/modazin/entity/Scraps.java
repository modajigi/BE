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
@Table(name= "scraps")
public class Scraps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="scraps_seq", nullable = false)
    private int scrapSeq;
    @Column(name="user_seq", nullable = false)
    private int userSeq;
    @Column(name="category_seq", nullable = false)
    private int categorySeq;
    @Column(name="folder_seq")
    private int folderSeq;

}
