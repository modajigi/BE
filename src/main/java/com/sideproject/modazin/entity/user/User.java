package com.sideproject.modazin.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;
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

    @Column(nullable = false , unique = true) // DB에 unique key 추가
    private String email;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    //    @Column(name = "password", nullable = false)
    private String password;

//    암호화
//    public void encodePassword(PasswordEncoder passwordEncoder){
//        this.password = passwordEncoder.encode(password);
//    }

    @Column(nullable = false)
    private float longitude;

    @Column(nullable = false)
    private float latitude;

    @Column(name = "location_created_at", nullable = false)
    private LocalDateTime locationCreatedAt;

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
    private LocalDateTime createdAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deleteAt;

    @Column(nullable = false)
    @ColumnDefault("'USER'") // default
    @Enumerated(EnumType.STRING)
    private Authority authority ;

}

