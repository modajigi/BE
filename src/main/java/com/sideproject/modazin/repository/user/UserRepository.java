package com.sideproject.modazin.repository.user;

import com.sideproject.modazin.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> { // dto로 변경하기


}