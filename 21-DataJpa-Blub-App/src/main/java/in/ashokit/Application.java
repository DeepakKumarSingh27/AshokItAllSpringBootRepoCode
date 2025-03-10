package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.repository.UserRepository;
import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserService userService = context.getBean(UserService.class);
		userService.saveUser();

	}

}
