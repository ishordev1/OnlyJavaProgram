package springCore.Property.Inj.Primative;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class apps {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springCore/Property/Inj/Primative/Config.xml");
Student st=(Student) context.getBean("student");
System.out.println(st);

}
}
