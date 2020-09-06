package com.demis.music.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "book")
    private Set<BookPublisher> bookPublishers = new HashSet<>();

}
