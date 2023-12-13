package com.sideproject.modazin.entity.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Authority {
    USER("USER"),
    ADMIN("ADMIN");

    private final String authority;
}



