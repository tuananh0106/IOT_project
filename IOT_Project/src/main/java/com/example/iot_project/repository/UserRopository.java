package com.example.iot_project.repository;

import com.example.iot_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRopository extends JpaRepository<User, Long> {
    User getUserByEmail(String email);
    User findUserByEmail(String email);
    @Query(
            value = "select * from dbo_users",
            nativeQuery = true)
    List<User> getAllUser();
}
