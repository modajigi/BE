package com.sideproject.modazin.service.user;

import com.sideproject.modazin.dto.user.UserDto;
import com.sideproject.modazin.dto.user.UserSignUpReq;
import com.sideproject.modazin.entity.user.User;
import com.sideproject.modazin.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    public User signUpUser(UserSignUpReq userSignUpReq) {
        validateDuplicateUser(userSignUpReq);

        // 비밀번호 암호화
        String encodedPassword = bCryptPasswordEncoder.encode(userSignUpReq.getPassword());

        User user = User.createUser(userSignUpReq, bCryptPasswordEncoder);

        return userRepository.save(user);
    }
    private void validateDuplicateUser(UserSignUpReq userSignUpReq) {
        if (userRepository.existsByEmail(userSignUpReq.getEmail())) {
            throw new IllegalStateException("이미 가입된 이메일입니다.");
        }

        if (userRepository.existsByNickName(userSignUpReq.getNickName())) {
            throw new IllegalStateException("이미 사용 중인 닉네임입니다.");
        }
    }
}
