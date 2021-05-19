package com.example.springbootjpa2.controller;

import com.example.springbootjpa2.dao.AlienRepo;
import com.example.springbootjpa2.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home()
    {

        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien()
    {
        repo.save(new Alien(101, "Keita", "Java"));
        repo.save(new Alien(102, "Tom", "Python"));
        repo.save(new Alien(103, "Cat", "C"));
        repo.save(new Alien(104, "Orange", "C++"));
        repo.save(new Alien(105, "John", "Android"));
        repo.save(new Alien(106, "Jenny", "Java"));
        return "home.jsp";
    }

//    @RequestMapping("/addAlien")
//    public String addAlien(Alien alien)
//    {
//        repo.save(alien);
//        return "home.jsp";
//    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid)
    {
        ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien());

        System.out.println(repo.findByTech("C"));
        System.out.println(repo.findByAidGreaterThan(102));
        System.out.println(repo.findByTechSorted("Java"));
        mv.addObject(alien);
        return mv;
    }
}
