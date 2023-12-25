package com.sideproject.modazin.dto.user;

import com.sideproject.modazin.entity.user.Authority;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpReq {
    private Long userSeq;
    private String email;
    private String nickName;
    private String password;
    private float longitude;
    private float latitude;
    private LocalDateTime locationCreatedAt;
    private String phoneNumber;
    private String profile;
    private String status;
    private String badge;
    private LocalDateTime createAt;
    private LocalDateTime deleteAt;

    @Enumerated(EnumType.STRING)
    private Authority authority ;

}
