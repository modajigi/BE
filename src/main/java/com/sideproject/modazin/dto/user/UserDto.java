package com.sideproject.modazin.dto.user;

import com.sideproject.modazin.entity.user.Authority;
import com.sideproject.modazin.entity.user.User;
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
public class UserDto {

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

    public User toEntity(String encodedPassword) {
        return  User.builder()
                 // .entity(dto)
                    .userSeq(userSeq)
                    .email(email)
                    .nickName(nickName)
                    .password(encodedPassword)
                    .longitude(longitude)
                    .latitude(latitude)
                    .locationCreatedAt(locationCreatedAt)
                    .phoneNumber(phoneNumber)
                    .profile(profile)
                    .status(status)
                    .badge(badge)
                    .createdAt(createAt)
                    .deleteAt(deleteAt)
                    .authority(authority)
                    .build();
    }
}
