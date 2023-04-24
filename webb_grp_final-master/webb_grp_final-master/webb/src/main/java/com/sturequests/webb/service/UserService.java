package com.sturequests.webb.service;


import com.sturequests.webb.dto.RegistrationDto;
import com.sturequests.webb.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
