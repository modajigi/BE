package com.sideproject.modazin.controller.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    /* 회원 가입 폼으로 이동 */
    @GetMapping("/user/signup")
    public String join() {
        return "/user/signup";
    }

//    @PostMapping("/user/signup")
//    public String join() {
//        return "/user/signup";
//    }


}
