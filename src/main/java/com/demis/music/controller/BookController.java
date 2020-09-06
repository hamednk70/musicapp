package com.demis.music.controller;

import com.demis.music.model.Book;
import com.demis.music.repository.BookREpo;
import com.demis.music.repository.SingerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    private BookREpo repo;
    @Autowired
    public BookController (BookREpo repo) {
        this.repo = repo;
    }

//    @GetMapping
//    public ModelAndView homeSinger(){
//        ModelAndView modelAndView = new ModelAndView("singer/singer-home");
//        Page<Book> all = repo.findAll(PageRequest.of(0,10));
//        List<Book> content= all.getContent();
////        model.addAttribute("singers",repo.findAll(PageRequest.of(0,10)).getContent());
////        model.addAttribute("books",repo.findAll());
//
//        modelAndView.addObject("orderList",content);
//        return modelAndView;
////        return "singer/singer-home";
//    }
}
