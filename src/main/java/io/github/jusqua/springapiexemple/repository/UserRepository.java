package io.github.jusqua.springapiexemple.repository;

import io.github.jusqua.springapiexemple.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Query("SELECT COALESCE(MAX(u.id), 0) FROM UserModel u")
    Optional<Long> findMaxId();
}
