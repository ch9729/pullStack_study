package com.secure.notes.services;

import com.secure.notes.dtos.UserDTO;
import com.secure.notes.models.Role;
import com.secure.notes.models.User;

import java.util.List;

public interface UserService {

    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
    
    // 유저 정보 가져오기
    User findByUsername(String username);

    // 유저 계정 잠금 상태 변경
    void updateAccountLockStatus(Long userId, boolean lock);

    // 모든 유저들 가져오기(DB에 있는 모든 권한들)
    List<Role> getAllRoles();

    // 계정만료상태 업데이트
    void updateAccountExpiryStatus(Long userId, boolean expire);

    // 계정사용가능상태 업데이트
    void updateAccountEnabledStatus(Long userId, boolean enabled);

    // 유저 계정 비번 만료상태 업데이트
    void updateCredentialsExpiryStatus(Long userId, boolean expire);

    // 패스워드 업데이트
    void updatePassword(Long userId, String password);

    // 패스워드 리셋토큰 생성
    void generatePasswordResetToken(String email);

    // 새 패스워드 업데이트
    void resetPassword(String token, String newPassword);
}
