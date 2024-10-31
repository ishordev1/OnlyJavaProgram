package springCore.Reference.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
public static void main(String[] args) {
	ApplicationContext con= new ClassPathXmlApplicationContext("springCore/Reference/Inject/Config.xml");
	Emp emp = (Emp) con.getBean("emp");
	System.out.println(emp);
}
}
