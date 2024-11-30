package com.project.postgresql.repository;

import com.project.postgresql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {
    @Query(value = "SELECT * FROM users WHERE name = :name" , nativeQuery = true)
    Optional<Users> getUserByUserName(@Param("name") String name);
}
