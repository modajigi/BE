package com.sideproject.modazin.service.user;

import com.sideproject.modazin.dto.user.UserDto;
import com.sideproject.modazin.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


//    public UserDto signup (UserDto userDto) {
//        return userRepository.save(userDto.toEntity());
//    }
}
