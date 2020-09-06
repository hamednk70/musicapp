package com.demis.music.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Vote {
    private Integer id;
    private Date dateVote;
    private Albom albom;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateVote() {
        return dateVote;
    }

    public void setDateVote(Date dateVote) {
        this.dateVote = dateVote;
    }
    @ManyToOne
    public Albom getAlbom() {
        return albom;
    }

    public void setAlbom(Albom albom) {
        this.albom = albom;
    }
    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
