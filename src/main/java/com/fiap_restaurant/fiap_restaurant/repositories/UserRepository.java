package com.fiap_restaurant.fiap_restaurant.repositories;

import com.fiap_restaurant.fiap_restaurant.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
}
