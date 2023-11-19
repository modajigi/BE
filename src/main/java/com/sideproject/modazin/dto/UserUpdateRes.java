package com.sideproject.modazin.dto;

import lombok.Setter;

@Setter
public class UserUpdateRes {
    private String code;
    private String message;
    UserSignUpReq userSignUpReq;
}
