package com.springcore.Autowiring.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class apps {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/Autowiring/ByName/config.xml");
Emp emp =(Emp)con.getBean("Emp");
System.out.println(emp);

}
}
