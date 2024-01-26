package AnandAcademy.Application.Hello;

import org.springframework.stereotype.Repository;

@Repository
public class Hello {
    Hello(){
        System.out.println("Hello :: Constructor");
    }
}
