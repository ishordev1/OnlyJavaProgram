package Autowiring.ByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class apps {
public static void main(String[] args) {
	ApplicationContext con =new ClassPathXmlApplicationContext("Autowiring/ByAnnotation/config.xml");
	Student st=(Student)con.getBean("student");
System.out.println(st);

}
}
