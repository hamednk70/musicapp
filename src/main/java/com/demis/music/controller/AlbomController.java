package com.demis.music.controller;

import com.demis.music.exception.ServiceException;
import com.demis.music.model.Albom;
import com.demis.music.model.Singer;
import com.demis.music.model.Style;
import com.demis.music.repository.AlbomRepo;
import com.demis.music.repository.AlbomRepo;
import com.demis.music.repository.SingerRepo;
import com.demis.music.repository.StyleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class AlbomController {

    private AlbomRepo repo;
    private SingerRepo singerRepo;
    private StyleRepo styleRepo;
    @Autowired
    public AlbomController(AlbomRepo repo, SingerRepo singerRepo, StyleRepo styleRepo) {
        this.repo = repo;
        this.singerRepo = singerRepo;
        this.styleRepo = styleRepo;
    }


    @GetMapping("/alboms")
    public String showPage(Model model){
        List<Albom> alboms = repo.findAll();
        model.addAttribute("alboms",alboms);
        List<Singer> singers = singerRepo.findAll();
        model.addAttribute("singers",singers);
        List<Style> styles = styleRepo.findAll();
        model.addAttribute("styles",styles);
        return "albom";
    }
//    @InitBinder
//    public void nitBinder(WebDataBinder dataBinder){
//        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"),false));
//    }
    @PostMapping("/alboms/addNew")
    public String addNew(Albom albom){
        repo.save(albom);
        return "redirect:/alboms";
    }

    @RequestMapping("/alboms/findById")
    @ResponseBody
    public Optional<Albom> findById(Integer id, Model model)
    {
//        Albom albom = repo.findById(id).get();
//        model.addAttribute("singerFlash", albom);
        return repo.findById(id);
    }
    @RequestMapping(value = "/alboms/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Albom albom){
        repo.save(albom);
        return "redirect:/alboms";
    }
    @RequestMapping(value = "/alboms/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        repo.deleteById(id);
        return "redirect:/alboms";
    }

}
