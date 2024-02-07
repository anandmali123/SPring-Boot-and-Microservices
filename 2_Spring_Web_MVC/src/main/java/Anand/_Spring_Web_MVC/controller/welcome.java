package Anand._Spring_Web_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcome {

    @GetMapping("/welcome")
    public ModelAndView Welcome(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","I am Java Developer");
        mav.setViewName("welcome");
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView Greet(){
        ModelAndView mav2=new ModelAndView();
        mav2.addObject("msg","Welcome ANand Mali in world of Spring boot");
        mav2.setViewName("greet");
        return mav2;

    }

}
