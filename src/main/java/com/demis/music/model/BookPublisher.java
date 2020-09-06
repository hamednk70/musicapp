package com.demis.music.model;

import javax.persistence.*;
import java.text.Format;

@Entity
public class BookPublisher {

        @EmbeddedId
        private BookPublisherId id = new BookPublisherId();

        @ManyToOne
        @MapsId("bookId")
        private Book book;

        @ManyToOne
        @MapsId("publisherId")
        private Publisher publisher;

        private Format format;



}
