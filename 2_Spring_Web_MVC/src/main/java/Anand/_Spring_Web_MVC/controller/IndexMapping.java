package Anand._Spring_Web_MVC.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexMapping {
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView obj=new ModelAndView();
        obj.setViewName("index");
        return obj;

    }
}
