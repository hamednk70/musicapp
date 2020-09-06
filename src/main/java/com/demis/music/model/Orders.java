package com.demis.music.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;
@Entity
public class Orders {
    private Integer id;
    private Date date;
    private User user;
    Set<OrderItem> orderItems;

    public Orders() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @OneToMany(mappedBy = "orders")
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
