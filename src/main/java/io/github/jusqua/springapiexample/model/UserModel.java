package io.github.jusqua.springapiexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {
    @Id
    private Long cpf;

    private String name;

    @Column(name = "birth_date")
    @JsonProperty("birth_date")
    private LocalDate birthDate;
}