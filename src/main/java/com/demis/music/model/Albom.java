package com.demis.music.model;

import com.sun.javafx.geom.transform.Identity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Albom {
    private int id;
    private String title;
    private String sample;
    private int price;
//    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Style style;
    private Singer singer;
    private Set<OrderItem> orderItems;
    private Set<Vote> votes;
    private String albomImage;

    @OneToMany(mappedBy = "albom")
    public Set<Vote> getVotes() {
        return votes;
    }

    public void setVotes(Set<Vote> votes) {
        this.votes = votes;
    }




    public Albom() {
    }


    @ManyToOne
//    @JoinColumn(name="singer_id", insertable=false, updatable=false)
    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }
    @ManyToOne
//    @JoinColumn(name="style_id", insertable=false, updatable=false)
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @OneToMany(mappedBy = "albom")
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getAlbomImage() {
        return albomImage;
    }

    public void setAlbomImage(String albomImage) {
        this.albomImage = albomImage;
    }

    @Override
    public String toString() {
        return "Albom{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sample='" + sample + '\'' +
                ", price=" + price +
                '}';
    }
}
