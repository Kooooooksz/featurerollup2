package com.feature.toggle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "users") // Megadhatod az adatbázis táblanévét
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false) // Megadhatod az oszlop tulajdonságait
    private Long id;

    @Column(name = "username", nullable = false, unique = true) // Például a username egyedi lehet
    private String username;

    @Column(name = "email", nullable = false, unique = true) // Az email is egyedi és nem lehet null
    private String email;

    @Column(name = "password", nullable = false) // A jelszó nem lehet null
    private String password;

    // Getters and Setters

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
