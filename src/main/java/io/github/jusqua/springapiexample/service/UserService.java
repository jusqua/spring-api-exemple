package io.github.jusqua.springapiexample.service;

import io.github.jusqua.springapiexample.model.UserModel;
import io.github.jusqua.springapiexample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }
}