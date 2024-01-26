package AnandAcademy.Application;

import AnandAcademy.Application.Programming.NoConstructor;
import AnandAcademy.Application.Security.AppSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = {"AnandClasses","AnandAcademy.Application"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		NoConstructor as = new NoConstructor();
	}
    @Bean
	public AppSecurity createInstance(){
		AppSecurity as=new AppSecurity();

		return as;
	}

}
