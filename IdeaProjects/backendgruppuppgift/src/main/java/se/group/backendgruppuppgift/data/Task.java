package se.group.backendgruppuppgift.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public final class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private taskStatus status;

    @ManyToOne
    private User user;

    protected Task(){}

    public Task(String name, User user) {
        this.name = name;
        this.user = user;
        this.status = taskStatus.UNSTARTED;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public taskStatus getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    private enum taskStatus{
        STARTED,
        UNSTARTED,
        DONE
    }

}
