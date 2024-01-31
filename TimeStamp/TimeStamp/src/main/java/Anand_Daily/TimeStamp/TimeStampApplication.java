package Anand_Daily.TimeStamp;

import Anand_Daily.TimeStamp.entiity.Team;
import Anand_Daily.TimeStamp.repository.Team_repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class TimeStampApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(TimeStampApplication.class, args);

		Team_repository obj=context.getBean(Team_repository.class);


		Team t1=new Team();
		t1.Name="Anand";
		t1.Salary =4.00;
		t1.Teamid= 1L;





		Team t2=new Team();
		t2.Name="Shraddha";
		t2.Salary=8.00;

		obp



	}

}
