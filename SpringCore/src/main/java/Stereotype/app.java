package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("Stereotype/config.xml");
		User user=(User)con.getBean("user");
		System.out.println(user);
		
	}

}
