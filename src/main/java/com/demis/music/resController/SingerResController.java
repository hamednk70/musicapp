package com.demis.music.resController;

import com.demis.music.exception.ServiceException;
import com.demis.music.model.Singer;
import com.demis.music.repository.SingerRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-singer")
public class SingerResController {
    private SingerRepo repo;
    @Autowired
    public SingerResController (SingerRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Singer> findAllsinger(){
        return repo.findAll();
    }
    @GetMapping("/{id:\\d+}")
//    @JsonView(Singer.viewGeneral.class)
    public Singer findOneSinger(@PathVariable int id) throws ServiceException {
        return repo.findById(id).orElseThrow(ServiceException::new);
    }
}
