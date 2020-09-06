package com.demis.music.repository;

import com.demis.music.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookREpo extends JpaRepository<Book, Integer> {
}
