package se.group.backendgruppuppgift.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public final class Team {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private Collection<User> users;

    private boolean active;

    protected Team(){}

    public Team(String name) {
        this.name = name;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public boolean isActive() {
        return active;
    }
}
