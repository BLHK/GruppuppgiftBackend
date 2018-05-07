package se.group.backendgruppuppgift.repository;

import org.springframework.data.repository.CrudRepository;
import se.group.backendgruppuppgift.data.Issue;

public interface IssueRepository extends CrudRepository<Issue, Long> {
}
