package com.demis.music.controller;

import com.demis.music.model.*;
import com.demis.music.model.User;
import com.demis.music.repository.UserRepo;
import com.demis.music.repository.SingerRepo;
import com.demis.music.repository.StyleRepo;
import com.demis.music.repository.UserRepo;
import com.sun.security.auth.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    private UserRepo repo;
    private BCryptPasswordEncoder encoder;

    public UserController(UserRepo repo, BCryptPasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @GetMapping("/users")
    public String showPage(Model model){
        List<User> users = repo.findAll();
        model.addAttribute("users",users);
        return "user";
    }
    @InitBinder
    public void nitBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"),false));
    }
//    @PostMapping("/users/addNew")
//    public String addNew(User user){
//        repo.save(user);
//        return "redirect:/users";
//    }
    @PostMapping("/users/addNew")
    public RedirectView addNew(User user, RedirectAttributes redir){
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        RedirectView redirectView = new RedirectView("/login",true);
        redir.addFlashAttribute("message", " You Successfully Resgistred! | You Can Now Login");
        return redirectView;
    }

//    @RequestMapping("/users/findById")
//    @ResponseBody
//    public Optional<User> findById(Integer id, Model model)
//    {
////        User user = repo.findById(id).get();
////        model.addAttribute("singerFlash", user);
//        return repo.findById(id);
//    }

    @RequestMapping("/users/findById")
    @ResponseBody
    public User findById(Integer id)
    {
        User user = repo.findById(id).get();
        return user;
    }

    @RequestMapping(value = "/users/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(User user){
        repo.save(user);
        return "redirect:/users";
    }
    @RequestMapping(value = "/users/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        repo.deleteById(id);
        return "redirect:/users";
    }

}
