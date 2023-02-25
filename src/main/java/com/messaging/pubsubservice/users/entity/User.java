package com.messaging.pubsubservice.users.entity;

import com.messaging.pubsubservice.subscribers.entity.Subscribers;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    @OneToOne(mappedBy ="User", cascade = CascadeType.ALL)
    private Subscribers subs;

    private String email;
    private String username;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}