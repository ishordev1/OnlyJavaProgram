package com.core.Collection.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/core/Collection/Inject/Config.xml");
Student st1=(Student)context.getBean("st");
System.out.println(st1);

}
}
