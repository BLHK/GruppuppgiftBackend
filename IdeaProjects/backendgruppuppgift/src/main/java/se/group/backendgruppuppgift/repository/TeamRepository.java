package se.group.backendgruppuppgift.repository;

import org.springframework.data.repository.CrudRepository;
import se.group.backendgruppuppgift.data.Team;

public interface TeamRepository  extends CrudRepository<Team, Long>{
}
