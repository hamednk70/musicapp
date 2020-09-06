package com.demis.music.model;

import javax.persistence.*;

@Entity
public class OrderItem {
    private Integer id;
    private int quntity;
    private Orders orders;
    private Albom albom;

    public OrderItem() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    @ManyToOne
    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    @ManyToOne
    public Albom getAlbom() {
        return albom;
    }

    public void setAlbom(Albom albom) {
        this.albom = albom;
    }

}
