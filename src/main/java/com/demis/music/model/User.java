package com.demis.music.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {
    private Integer id;
    private String name;
    private String family;
    private String username;
    private String email;
    private String password;
    private short flag;
    private short manager;
//    private Set<Vote> votes;
    private Set<Orders> orders;
    public User() {
    }

    @OneToMany(mappedBy = "user")
    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

//    @OneToMany(mappedBy = "user")
//    public Set<Vote> getVotes() {
//        return votes;
//    }
//
//    public void setVotes(Set<Vote> votes) {
//        this.votes = votes;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getManager() {
        return manager;
    }

    public void setManager(short manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getFlag() {
        return flag;
    }

    public void setFlag(short flag) {
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //    public Set<AlbomRating> getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(Set<AlbomRating> ratings) {
//        this.ratings = ratings;
//    }
}
