package Rest.Api.Client.Application.Rest_Api_Client_App;

import Rest.Api.Client.Application.Rest_Api_Client_App.Service.BookClient;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApiClientAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(RestApiClientAppApplication.class, args);
		BookClient bean=context.getBean(BookClient.class);

		bean.getRequest();
	}

}
