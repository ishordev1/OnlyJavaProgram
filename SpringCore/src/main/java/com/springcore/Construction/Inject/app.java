package com.springcore.Construction.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/Construction/Inject/config.xml");
Person bean = (Person) con.getBean("person");
System.out.println(bean);

}
}
