package com.tts.APIlecture.service;

import com.tts.APIlecture.model.User;
import com.tts.APIlecture.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {return userRepository.findAll();}
    public void save(User user){
        userRepository.save(user);
    }
    public List<String> findByState() {return userRepository.findByState();}
}
