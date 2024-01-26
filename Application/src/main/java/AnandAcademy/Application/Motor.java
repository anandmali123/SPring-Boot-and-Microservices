package AnandAcademy.Application;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configurable
public class Motor {
    Motor() {
        System.out.println("Motor :: Constructor");
    }
}
