package com.sideproject.modazin.controller.user;

import com.sideproject.modazin.dto.user.UserSignUpReq;
import com.sideproject.modazin.entity.user.User;
import com.sideproject.modazin.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /* 회원 가입 폼으로 이동 */
    @GetMapping("/signup")
    public String signUpForm() {
        return "/user/signup";
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signUpUser(@RequestBody UserSignUpReq userSignUpReq) {
        try {
            userService.signUpUser(userSignUpReq);
            return ResponseEntity.ok("회원가입이 성공적으로 완료되었습니다.");
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}

//@RestController
//@RequestMapping("/user")
//@RequiredArgsConstructor
//public class UserController {
//
//    private final UserService userService;
//
//    /* 회원 가입 폼으로 이동 */
//    @GetMapping("/signup")
//    public ResponseEntity<String> signUpForm() {
//        // 이 부분에서 적절한 응답을 반환하거나 뷰 이름을 반환하도록 수정
//        return ResponseEntity.ok("회원 가입 폼으로 이동");
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity<String> signUpUser(@RequestBody UserSignUpReq userSignUpReq) {
//        try {
//            userService.signUpUser(userSignUpReq);
//            return ResponseEntity.ok("회원가입이 성공적으로 완료되었습니다.");
//        } catch (IllegalStateException e) {
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
//}
