package com.secure.notes.repositories;

import com.secure.notes.models.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 유저를 찾을때 username을 통해 찾는다.
    Optional<User> findByUserName(String username);

    // 유저네임으로 유저가 있는지 확인
    Boolean existsByUserName(String username);

    // 이메일로 유저가 있는지 확인
    Boolean existsByEmail(String email);
}
