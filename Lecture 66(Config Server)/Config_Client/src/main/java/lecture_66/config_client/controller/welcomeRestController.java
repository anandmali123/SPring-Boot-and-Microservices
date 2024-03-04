package lecture_66.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope// git madhe changes kelyananatar atomatically reload hotat application refresh karayachi garaz naste
@RestController   //for making our class to response
public class welcomeRestController {
    @Value("${msg:Config server not working}")
    private String msg;
    @GetMapping("/")
    public String getWelcomeMsg(){
        return msg;
    }



}
