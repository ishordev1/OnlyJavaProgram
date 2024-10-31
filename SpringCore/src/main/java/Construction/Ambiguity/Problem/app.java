package Construction.Ambiguity.Problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("Construction/Ambiguity/Problem/config.xml");
	Addition ad=(Addition) con.getBean("ad");
	System.out.println(ad);
	
}
}
