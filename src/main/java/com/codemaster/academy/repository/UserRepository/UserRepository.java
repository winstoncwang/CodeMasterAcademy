package com.codemaster.academy.repository.UserRepository;

import com.codemaster.academy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
