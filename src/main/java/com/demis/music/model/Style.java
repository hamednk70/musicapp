package com.demis.music.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Style {
    private int id;
    private String title;
//    private List<Albom> alboms = new ArrayList<>();


//    @OneToMany(mappedBy = "style", cascade = CascadeType.ALL, orphanRemoval = true)
//    public List<Albom> getAlboms() {
//        return alboms;
//    }
//
//    public void setAlboms(List<Albom> alboms) {
//        this.alboms = alboms;
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
