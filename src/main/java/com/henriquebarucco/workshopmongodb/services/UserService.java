package com.henriquebarucco.workshopmongodb.services;

import com.henriquebarucco.workshopmongodb.domain.User;
import com.henriquebarucco.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
