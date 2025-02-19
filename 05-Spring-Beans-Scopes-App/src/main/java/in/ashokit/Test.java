package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Motor motor1 = context.getBean("motor", Motor.class);
		System.out.println(motor1.hashCode());

		Motor motor2 = context.getBean("motor", Motor.class);
		System.out.println(motor2.hashCode());

	}

}
