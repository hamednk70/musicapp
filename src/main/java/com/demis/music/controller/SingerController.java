package com.demis.music.controller;

import com.demis.music.exception.ServiceException;
import com.demis.music.model.Singer;
import com.demis.music.repository.SingerRepo;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class SingerController {

    private SingerRepo repo;
    @Autowired
    public SingerController (SingerRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/singers")
    public String showPage(Model model){
        List<Singer> singers = repo.findAll();
        model.addAttribute("singers",singers);
        return "singer";
    }
    @PostMapping("/singers/addNew")
    public String addNew(Singer singer){
        repo.save(singer);
        return "redirect:/singers";
    }

    @RequestMapping("/singers/findById")
    @ResponseBody
    public Optional<Singer> findById(int id){
        return repo.findById(id);
    }

    @RequestMapping(value = "/singers/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Singer singer){
        repo.save(singer);
        return "redirect:/singers";
    }
    @RequestMapping(value = "/singers/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id,Model model){
        repo.deleteById(id);
        return "redirect:/singers";
    }
//    @GetMapping
//    @ResponseBody
//    public List<Singer> homeSinger(Model model){
////        ModelAndView modelAndView = new ModelAndView("singer/singer-home");
////        Page<Singer> all = repo.findAll(PageRequest.of(0,10));
////        List<Singer> content= all.getContent();
////        model.addAttribute("Singers",repo.findAll());
////        modelAndView.addObject("singers",content);
////        return modelAndView;
//
//
////        model.addAttribute("singers",repo.findAll(PageRequest.of(0,10)).getContent());
////        model.addAttribute("message",message);
////        return "singer/singer-home";
//        model.addAttribute("cu","customer");
//        return repo.findAll();
//    }

//    @GetMapping("/home")
//    public String homeSingert(@ModelAttribute("message") String message,Model model){
////        ModelAndView modelAndView = new ModelAndView("singer/singer-home");
////        Page<Singer> all = repo.findAll(PageRequest.of(0,10));
////        List<Singer> content= all.getContent();
////        model.addAttribute("Singers",repo.findAll());
////        modelAndView.addObject("singers",content);
////        return modelAndView;
//
//
//        model.addAttribute("singers",repo.findAll(PageRequest.of(0,10)).getContent());
//        model.addAttribute("message",message);
//        return "singer/home";
//
////        return repo.findAll();
//    }
//    @GetMapping("/detail")
//    public String singerDetails(@RequestParam int id,Model model) throws ServiceException {
//        model.addAttribute("singer",repo.findById(id).orElseThrow(ServiceException::new));
//        return "singer/singer-details";
//    }
//    @GetMapping("/detail/{id}")
//    public String getsingerDetails(@PathVariable int id, Model model) throws ServiceException {
//        model.addAttribute("singer",repo.findById(id).orElseThrow(ServiceException::new));
//        return "singer/singer-update";
//    }
//    @PostMapping("/update")
//    public String singerUpdate(Singer singer, RedirectAttributes redirectAttributes){
//        repo.updateSingerByAgeFullNameNikeNameId(singer.getAge(),singer.getFullname(),singer.getNikename(),singer.getId());
//        redirectAttributes.addFlashAttribute("message","done");
//        return "redirect:/singer/";
//
//    }
//    @GetMapping("/step1")
//    public String step1(Model model){
//        model.addAttribute("singer",new Singer());
//        return "singer/step1";
//    }
//    @PostMapping("/step2")
//    public String step2(Singer singer,Model model){
////        model.addAttribute("singer",singer);
//        return "singer/step2";
//    }

}
