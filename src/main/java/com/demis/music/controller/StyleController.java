package com.demis.music.controller;

import com.demis.music.model.Style;
import com.demis.music.repository.StyleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
public class StyleController {

    private StyleRepo repo;
    @Autowired
    public StyleController(StyleRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/styles")
    public String showPage(Model model){
        List<Style> styles = repo.findAll();
        model.addAttribute("styles",styles);
        return "style";
    }
    @PostMapping("/styles/addNew")
    public String addNew(Style style){
        repo.save(style);
        return "redirect:/styles";
    }

    @RequestMapping("/styles/findById")
    @ResponseBody
    public Optional<Style> findById(int id){
        return repo.findById(id);
    }
//    @RequestMapping("/styles/findById")
//    @ResponseBody
//    public List<Style> findById(int id){
//        List<Style> styles = repo.findAll();
//        return styles;
//    }


    @RequestMapping(value = "/styles/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Style style){
        repo.save(style);
        return "redirect:/styles";
    }
    @RequestMapping(value = "/styles/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        repo.deleteById(id);
        return "redirect:/styles";
    }
    @GetMapping("/updateAllStyle")
    public String updateItem( ){
//        cart.updateQunatity(id, quantity);
        return "showShoppingcart";
    }
}
