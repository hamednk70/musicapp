package com.demis.music.repository;

import com.demis.music.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepo extends JpaRepository<Style, Integer> {
}
