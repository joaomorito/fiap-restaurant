package com.fiap_restaurant.fiap_restaurant.services;

import com.fiap_restaurant.fiap_restaurant.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;
}
