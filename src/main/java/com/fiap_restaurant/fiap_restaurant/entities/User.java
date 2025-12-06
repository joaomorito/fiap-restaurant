package com.fiap_restaurant.fiap_restaurant.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String login;

    private String password;

    @UpdateTimestamp
    private Date lastUpdate;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private boolean restaurantOwner;
}
