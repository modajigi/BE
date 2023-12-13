package com.sideproject.modazin.service.user;

import com.sideproject.modazin.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

//    @Transactional
//    public int join (UserDto userDto) {
//
//    }
}
