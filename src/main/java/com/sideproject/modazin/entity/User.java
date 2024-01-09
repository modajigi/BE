package com.sideproject.modazin.entity;

import com.sideproject.modazin.dto.UserSignUpDto;
import com.sideproject.modazin.enums.Authority;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@Table(name= "user")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_seq", nullable = false)
    private Long userSeq;

    @Column(nullable = false )
    private String email;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(nullable = true)
    private BigDecimal longitude;

    @Column(nullable = true)
    private BigDecimal latitude;

    @Column(name = "location_created_at", nullable = true)
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

    public static User createUser(UserSignUpDto userSignUpDto, PasswordEncoder passwordEncoder) {
        return User.builder()
                .email(userSignUpDto.getEmail())
                .nickName(userSignUpDto.getNickName())
                .password(passwordEncoder.encode(userSignUpDto.getPassword()))
                .longitude(userSignUpDto.getLongitude())
                .latitude(userSignUpDto.getLatitude())
                .locationCreatedAt(LocalDateTime.now()) // 현재 시간 사용
                .phoneNumber(userSignUpDto.getPhoneNumber())
                .profile(userSignUpDto.getProfile())
                .status("Y")
                .badge(userSignUpDto.getBadge())
                .createdAt(LocalDateTime.now()) // 현재 시간 사용
                .deleteAt(null) // 초기에는 삭제 시간이 없음
                .authority(Authority.USER)
                .build();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("USER"));
        return authorityList;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    // 계정 만료여부
    @Override
    public boolean isAccountNonExpired() {
        return true; // true : 만료 x
    }

    // 계정 잠금여부
    @Override
    public boolean isAccountNonLocked() {
        return true; // true : 잠금 x
    }

    // 패스워드 만료 여부
    @Override
    public boolean isCredentialsNonExpired() {
        return true; // true : 만료 x
    }

    // 계정 사용가능 여부
    @Override
    public boolean isEnabled() {
        return true; // true : 사용가능
    }


}

