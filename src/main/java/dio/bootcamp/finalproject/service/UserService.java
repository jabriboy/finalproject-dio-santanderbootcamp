package dio.bootcamp.finalproject.service;

import java.util.List;

import dio.bootcamp.finalproject.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

    List<User> getAllUser();
}
