package Anand._Spring_Web_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
           @GetMapping("/wish")
           public ModelAndView wish(){
               ModelAndView obj=new ModelAndView();
               obj.addObject("msg","Happpy bIRTHDAY Anand");
               obj.setViewName("wish");

               return obj;


           }
}
