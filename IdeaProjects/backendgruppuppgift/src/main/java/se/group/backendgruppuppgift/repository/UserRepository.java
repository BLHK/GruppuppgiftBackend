package se.group.backendgruppuppgift.repository;

import org.springframework.data.repository.CrudRepository;
import se.group.backendgruppuppgift.data.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
