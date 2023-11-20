package com.spring.springsecurity.model;

import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "authorities")

public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "authoritie_name")
    private String authoritieName;

    @ManyToMany(mappedBy = "authorities")
    private List<User> users;

    public Authorities() {
    }

    public Authorities(String authoritieName) {
        this.authoritieName = authoritieName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthoritieName() {
        return authoritieName;
    }

    public void setAuthoritieName(String authoritieName) {
        this.authoritieName = authoritieName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
