package se.group.backendgruppuppgift.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class Issue {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private boolean done;

    private Task task;

    protected Issue(){}

    public Issue(String description, Task task) {
        this.description = description;
        this.task = task;
        this.done = false;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public Task getTask() {
        return task;
    }
}
