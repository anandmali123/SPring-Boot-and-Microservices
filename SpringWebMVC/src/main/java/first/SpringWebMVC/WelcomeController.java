package first.SpringWebMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @GetMapping("/Welcome")
    public ModelAndView getWelComeMsg() {

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Happy Rose Day Shraddha");
        mav.setViewName("index");
        return mav;
    }

}
