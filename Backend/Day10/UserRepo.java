package com.example.springapp.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.entity.Users;


@Repository
public interface UserRepo extends JpaRepository<Users,Long>{
    Optional<Users> findByEmail(String email);
}