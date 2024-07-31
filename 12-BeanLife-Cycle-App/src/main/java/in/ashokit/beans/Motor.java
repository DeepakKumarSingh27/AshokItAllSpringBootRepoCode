package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {

	public Motor() {
		System.err.println("Motor :: 0 param Constructor..");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After propertiesSet() method call..");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method called..");
	}

}
