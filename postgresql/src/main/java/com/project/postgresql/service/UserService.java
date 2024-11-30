package com.project.postgresql.service;

import com.project.postgresql.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<Users> getAllUser();
    void addUser(Users user);
    Optional<Users> getUserByUserName(String name);
}
