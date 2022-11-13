package com.example.iot_project.service;

import com.example.iot_project.dto.UserDto;
import com.example.iot_project.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void save(UserDto userDto);
    Boolean checkPasswordUser(String email,String password);
    Boolean checkUserbyEmail(String email);
    User getUserbyEmail(String email);
}
