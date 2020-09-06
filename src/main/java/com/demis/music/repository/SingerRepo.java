package com.demis.music.repository;

import com.demis.music.model.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SingerRepo extends JpaRepository<Singer, Integer> {
    @Modifying
    @Transactional
    @Query("update Singer SET age=?1, fullname=?2, nikename=?3 WHERE id=?4")
    int updateSingerByAgeFullNameNikeNameId(String age, String fullname, String nikename,int id);
}
