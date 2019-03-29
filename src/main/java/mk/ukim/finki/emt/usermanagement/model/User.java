package mk.ukim.finki.emt.usermanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String username;

    private String hashPassword;

    private String email;

    private Role role;



}
