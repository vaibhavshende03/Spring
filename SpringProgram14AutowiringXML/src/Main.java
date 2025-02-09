import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vs.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String configLocation="/com/vs/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		Student std=(Student)context.getBean("stdId");
		std.display();
	}

}
