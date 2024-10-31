package com.GetterSetter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class apps {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/GetterSetter2/config.xml");
User user=(User) context.getBean("user2");
System.out.println(user);
}
}
