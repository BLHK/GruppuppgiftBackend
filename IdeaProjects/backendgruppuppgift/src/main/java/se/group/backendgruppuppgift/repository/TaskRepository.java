package se.group.backendgruppuppgift.repository;

import org.springframework.data.repository.CrudRepository;
import se.group.backendgruppuppgift.data.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
