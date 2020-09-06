package com.demis.music.repository;

import com.demis.music.model.Albom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbomRepo extends JpaRepository<Albom, Integer> {
}
