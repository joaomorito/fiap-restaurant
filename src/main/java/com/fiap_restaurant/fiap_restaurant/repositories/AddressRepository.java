package com.fiap_restaurant.fiap_restaurant.repositories;

import com.fiap_restaurant.fiap_restaurant.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
