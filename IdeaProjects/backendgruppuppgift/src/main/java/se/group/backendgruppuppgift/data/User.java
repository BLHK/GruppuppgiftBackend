package se.group.backendgruppuppgift.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class User {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private boolean active;

    protected User(){}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return String.format("id: %s, firstName: %s, lastName: %s, boolean: %s", id, firstName, lastName, active);
    }
}
