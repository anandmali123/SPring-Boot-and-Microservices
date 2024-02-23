package lecture3.Rest.Template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestTemplateApplication.class, args);
		String apiURL="https://www.nokia.com/";
		RestTemplate rt =new RestTemplate();

		ResponseEntity<String> forEntity= rt.getForEntity(apiURL,String.class);

		String body=forEntity.getBody();

		System.out.println(body);
	}

}
