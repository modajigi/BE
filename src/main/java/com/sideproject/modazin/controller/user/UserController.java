package com.sideproject.modazin.controller.user;

import com.sideproject.modazin.dto.user.ResponseDto;
import com.sideproject.modazin.dto.user.UserDto;
import com.sideproject.modazin.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/signup")
    public String signup() {
        return "users/signup";
    }

//    @PostMapping("/signup")
//    public ResponseEntity signup(@RequestBody UserDto userDto) {
//        return userService.signup(userDto);
//    }


}
