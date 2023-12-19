package com.sideproject.modazin.repository.user;

import com.sideproject.modazin.dto.user.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDto, Long> { //JpaRepository<Entity 클래스, PK 타입>


}
