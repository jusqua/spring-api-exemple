package io.github.jusqua.springapiexample.repository;

import io.github.jusqua.springapiexample.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {}
