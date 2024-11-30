package com.project.postgresql.service;

import com.project.postgresql.model.Users;
import com.project.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public Optional<Users> getUserByUserName(String name) {
        return userRepository.getUserByUserName(name);
    }
}
