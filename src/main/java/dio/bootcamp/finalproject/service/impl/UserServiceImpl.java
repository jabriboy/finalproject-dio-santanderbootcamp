package dio.bootcamp.finalproject.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.bootcamp.finalproject.model.User;
import dio.bootcamp.finalproject.repository.UserRepository;
import dio.bootcamp.finalproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    public UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (repository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return repository.save(userToCreate);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

}
