package lecture4.Book.Api.Client.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookApiClientAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(BookApiClientAppApplication.class, args);

	}

}
