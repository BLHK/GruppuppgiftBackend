package se.group.backendgruppuppgift.service;

import org.springframework.stereotype.Service;
import se.group.backendgruppuppgift.data.User;
import se.group.backendgruppuppgift.repository.UserRepository;

@Service
public final class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user){
        return repository.save(new User(user.getFirstName(), user.getLastName()));
    }
}
