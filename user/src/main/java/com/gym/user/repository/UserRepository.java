package com.gym.user.repository;

import com.gym.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, Long> {
}
