package Anand_daily.Composite_primary_Key;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CompositePrimaryKeyApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(CompositePrimaryKeyApplication.class, args);

		AccountService accountService=context.getBean(AccountService.class);
        accountService.saveAccData();
		//accountService.getDataUsingPK();

		context.close();
	}

}
