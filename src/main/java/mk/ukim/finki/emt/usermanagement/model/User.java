package mk.ukim.finki.emt.usermanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Random;


public class User {

    public Long id;

    public String name;

    public String username;

    public String hashPassword;

    public String email;

    public Role role;

    public boolean activated = false;

    public ZonedDateTime dateCreated;

    public ActivationCode activationCode;

    public User() {

    }

    public User(String name, String username, String hashPassword, String email, Role role, ZonedDateTime dateCreated, String activationCode) {
        this.name = name;
        this.username = username;
        this.hashPassword = hashPassword;
        this.email = email;
        this.role = role;
        this.dateCreated = dateCreated;

        dateCreated = ZonedDateTime.now();


    }

    /**
     * Factory method
     */

    public User createUnconfirmedUser (String name, String username, String hashPassword, String email) {
        User user = new User();
        user.activated=false;
        user.username=username;
        user.name=name;
        user.email=email;
        user.dateCreated=ZonedDateTime.now();
        user.role=Role.USER;
        user.activationCode = ActivationCode.createActivationCodePerUser(user.dateCreated);
        return user;

    }

    public boolean shouldBeDeleted() {
        return activationCode.expirationDate.isBefore(ZonedDateTime.now());
    }

}
