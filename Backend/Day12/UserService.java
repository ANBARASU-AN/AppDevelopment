package com.example.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.entity.Users;
import com.example.springapp.repository.UserRepo;



@Service
public class UserService {
    @Autowired
    UserRepo ur;
     
     
     @SuppressWarnings("null")
     public boolean AddUser(Users ue)
     {
          ur.save(ue);
          return true;
     }
     public List<Users> getUser()
     {
          return ur.findAll();
     }
     @SuppressWarnings("null")
     public Optional<Users> getById(Long id)
     {
    	 return ur.findById(id);
     }
}