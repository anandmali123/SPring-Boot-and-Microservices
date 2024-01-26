package AnandAcademy.Application.Programming;

import org.springframework.stereotype.Component;

@Component
public class  NoConstructor {
    public NoConstructor(){
        System.out.print("here i can understand without annotation i can call this constructor ");

    }
}
