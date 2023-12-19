package com.sideproject.modazin.entity.user;

import com.sideproject.modazin.dto.user.UserSignUpReq;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
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

    @Column(nullable = false , unique = true) // unique key 추가
    private String email;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    @Column(name = "password", nullable = false)
    private String password;

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

    public void createUser(UserSignUpReq userSignUpReq, PasswordEncoder passwordEncoder) {
        User.builder()
                .email(userSignUpReq.getEmail())
                .nickName(userSignUpReq.getNickName())
                .password(passwordEncoder.encode(userSignUpReq.getPassword()))
                .longitude(userSignUpReq.getLongitude())
                .latitude(userSignUpReq.getLatitude())
//                .locationCreatedAt(new Date())
                .phoneNumber(userSignUpReq.getPhoneNumber())
                .profile(userSignUpReq.getProfile())
                .status("Y")
                .badge(userSignUpReq.getBadge())
//                .createdAt(new Date())
//                .deleteAt(new Date())
                .authority(Authority.USER)
                .build();
    }

}

