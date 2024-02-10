package Practise.User_Ragistration_Form.Controller;

import Practise.User_Ragistration_Form.bindings.User;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @GetMapping("/")
    public String getForm(Model model){
        User user=new User();

        model.addAttribute("user",user);
        return "index";


    }

    @PostMapping("/register")
    public String handleRegisterBtn(@Valid User userForm,BindingResult result,Model model) {
         if(result.hasErrors()){
            return "index";
         }
        System.out.println(userForm);
         model.addAttribute("msg", "Your Registration Successfully...!!");

        return "success";
    }
    
}
