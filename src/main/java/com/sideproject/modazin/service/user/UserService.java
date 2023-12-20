package com.sideproject.modazin.service.user;

import com.sideproject.modazin.dto.user.UserDto;
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

//    public User signUpUser(User user) {
//        validateDuplicateUser(user);
//        return userRepository.save(user);
//    }

//    private void validateDuplicateUser(User user) {
//        User findUser = userRepository.findByEmail(user.getEmail());
//        if(findUser != null) {
//            throw new IllegalStateException("이미 가입된 회원입니다.");
//        }
//    }
    public boolean checkEmailDuplicate(String email) {
        return userRepository.existsByEmail(email);
    }

    public boolean checkNickNameDuplicate (String nickName) {
        return userRepository.existsByNickName(nickName);
    }

}
