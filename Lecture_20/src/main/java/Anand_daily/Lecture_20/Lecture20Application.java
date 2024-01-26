package Anand_daily.Lecture_20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lecture20Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Lecture20Application.class, args);

		ReportService reportService = context.getBean(ReportSer)
	}

}
