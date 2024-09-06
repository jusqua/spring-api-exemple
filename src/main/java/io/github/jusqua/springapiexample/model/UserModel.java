package io.github.jusqua.springapiexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {
    // Getters and Setters
    @Id
    private Long id;
    private String name;
    private String email;
}