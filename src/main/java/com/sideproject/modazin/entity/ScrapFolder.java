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
@Table(name= "scrap_folder")
public class ScrapFolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="folder_seq", nullable = false)
    private int folderSeq;
    @Column(name="folder_name", nullable = false)
    private String folderName;
    @Column(name="user_seq", nullable = false)
    private int userSeq;
    @Column(name="status", nullable = false)
    private String status = "Y";
}
