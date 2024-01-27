package Anand_daily.Bean_Life_Cycle.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Engine {
            public Engine(){
                System.out.println("Engine Constructor: Called ");
            }
            @PostConstruct
            public void init(){
                System.out.println("Life Started....");
            }
            @PreDestroy
            public void destroy(){
                System.out.println("Dead.....");
            }
}

