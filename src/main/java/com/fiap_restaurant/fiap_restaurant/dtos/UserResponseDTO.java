package com.fiap_restaurant.fiap_restaurant.dtos;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        String login,
        boolean restaurantOwner
) {}