package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);
		/*
		 * User u5 = new User(105, "Ganesh", "male", 45, "India"); User u6 = new
		 * User(106, "Orlin", "male", 34, "Germany"); User u7 = new User(107, "Charles",
		 * "male", 35, "Maxio"); User u8 = new User(108, "Buttler", "male", 36,
		 * "Australia"); User u9 = new User(109, "cathy", "fe-male", 29, "USA"); User
		 * u10 = new User(110, "Tanny", "fe-male", 28, "Canada");
		 * repository.saveAll(Arrays.asList(u5, u6, u7, u8, u9, u10));
		 */
		// List<User> users = repository.findAll();
		// List<User> users = repository.findAll(Sort.by("age").ascending());

		// List<User> users = repository.findAll(Sort.by("userName",
		// "age").descending());

		/*
		 * int pageSize = 5; int pageNo = 0;
		 * 
		 * PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		 * 
		 * Page<User> pageData = repository.findAll(pageRequest); int totalPages =
		 * pageData.getTotalPages(); System.out.println("Total pages :: " + totalPages);
		 * List<User> users = pageData.getContent();
		 * 
		 * users.forEach(e -> System.err.println(e));
		 */
          //QBE
		User entity = new User();
		entity.setCountry("India");
		entity.setAge(24);
		Example<User> example = Example.of(entity);
		List<User> users = repository.findAll(example);
		users.forEach(e -> System.err.println(e));
         
		
		//repository.findAll(example,Pageable);
		//repository.findAll(example,Sort);
	}

}
