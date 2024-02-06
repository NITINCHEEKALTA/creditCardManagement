package creditCard.CreditCardManagement.creditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("creditCard")
@EntityScan("creditCard")
@EnableJpaRepositories("creditCard.CreditCardManagement.repository")
public class CreditCardManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardManagementApplication.class, args);
	}

}
