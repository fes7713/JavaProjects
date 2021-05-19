package com.example.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public ModelAndView home(Alien alien)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);

        mv.setViewName("home");
        return mv;
    }
//    public ModelAndView home(@RequestParam("name") String myName)
//    {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", myName);
//
//        mv.setViewName("home");
//        return mv;
//    }
//    public String home(@RequestParam("name") String name, HttpSession session)
//    {
//        System.out.println("hi " + name);
//        session.setAttribute("name", name);
//        return "home";
//    }

}
