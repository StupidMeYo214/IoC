import java.util.List;

import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsx.service.UserService;

public class ClassTest {


	
	@Test
	public void test2() throws Exception {
		//ApplicationContext factory = new ClassPathXmlApplicationContext("springConfigAuto-Detecting-Component.xml");
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("springConfigAuto-Detecting-Component.xml");
		UserService service1= (UserService)factory.getBean("service");
		UserService service2= (UserService)factory.getBean("service");
		//System.out.println(service.getUserDAO());
		System.out.println(service1 == service2);
		//service.add(new User());
		//factory.destroy();
		
	}

}
