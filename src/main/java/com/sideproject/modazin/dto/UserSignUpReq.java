package com.sideproject.modazin.dto;


import lombok.Getter;

@Getter
public class UserSignUpReq {
    private String email;
    private String nickName;
    private String password;
    private int longtitude;
    private int latitude;
    private String phoneNumber;
    private String profile;

    public UserSignUpReq() {
    }
}
