package com.fiap_restaurant.fiap_restaurant.services;

import com.fiap_restaurant.fiap_restaurant.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


}
