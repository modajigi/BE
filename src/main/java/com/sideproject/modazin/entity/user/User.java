package com.sideproject.modazin.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_seq", nullable = false)
    private Long userSeq;

    @Column(nullable = false)
    private String email;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    //    @Column(name = "password", nullable = false)
    private String password;

    @Column(nullable = false)
    private float longitude;

    @Column(nullable = false)
    private float latitude;

    @Column(name = "location_created_at", nullable = false)
    private Date locationCreatedAt;

    @Column(name = "phone_number", nullable = true)
    private String phoneNumber;

    @Column(nullable = true)
    private String profile;

    @Column(nullable = false)
    @ColumnDefault("'Y'")
    private String status;

    @Column(nullable = true)
    private String badge;

    @Column(name = "created_at", nullable = false)
    private Date CreatedAt;

    @Column(name = "deleted_at", nullable = true)
    private Date DeleteAt;

    @Column(nullable = false)
    @ColumnDefault("'USER'") // default
    @Enumerated(EnumType.STRING)
    private Authority authority ;

}

