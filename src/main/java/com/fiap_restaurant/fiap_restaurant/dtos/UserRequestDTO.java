package com.fiap_restaurant.fiap_restaurant.dtos;

public record UserRequestDTO(
        String name,
        String email,
        String login,
        String password,
        boolean restaurantOwner
) {}