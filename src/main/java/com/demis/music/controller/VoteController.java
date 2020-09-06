package com.demis.music.controller;

import com.demis.music.model.Vote;
import com.demis.music.repository.VoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class VoteController {

    private VoteRepo repo;
    @Autowired
    public VoteController(VoteRepo repo) {
        this.repo = repo;
    }


    @GetMapping("/votes")
    public String showPage(Model model){
        List<Vote> votes = repo.findAll();
        model.addAttribute("votes",votes);
        return "vote";
    }
    @InitBinder
    public void nitBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"),false));
    }
    @PostMapping("/votes/addNew")
    public String addNew(Vote vote){
        repo.save(vote);
        return "redirect:/votes";
    }

    @RequestMapping("/votes/findById")
    @ResponseBody
    public Optional<Vote> findById(Integer id, Model model)
    {
//        Vote vote = repo.findById(id).get();
//        model.addAttribute("singerFlash", vote);
        return repo.findById(id);
    }
    @RequestMapping(value = "/votes/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Vote vote){
        repo.save(vote);
        return "redirect:/votes";
    }
    @RequestMapping(value = "/votes/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        repo.deleteById(id);
        return "redirect:/votes";
    }

}
